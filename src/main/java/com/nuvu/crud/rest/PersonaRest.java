package com.nuvu.crud.rest;

import com.nuvu.crud.Service.AuthService;
import com.nuvu.crud.Service.PersonaService;
import com.nuvu.crud.model.Persona;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/persona")
public class PersonaRest {
    
    @Autowired
    private PersonaService personaService;
    
    @Autowired
    private AuthService authService;
    
    @PostMapping
    private ResponseEntity<Persona> guardar(@RequestBody Persona persona, @RequestHeader("authorization") String token){
        Persona temporal = personaService.create(persona);
        
        if (authService.Auth(token)) {
            try {
            return ResponseEntity.created(new URI("/api/persona" + temporal.getId())).body(temporal);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        }else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
    
    @GetMapping
    private ResponseEntity<List<Persona>> listarTodo(@RequestHeader("authorization") String token){
        if (authService.Auth(token)) {
                    return ResponseEntity.ok(personaService.getAllPersonas());
        }else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
    
    @GetMapping (value = "{id}")
    private ResponseEntity<Optional<Persona>> listarPersona(@PathVariable ("id") Long id, @RequestHeader("authorization") String token){
        if (authService.Auth(token)) {
                    return ResponseEntity.ok(personaService.findById(id));
        }else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
