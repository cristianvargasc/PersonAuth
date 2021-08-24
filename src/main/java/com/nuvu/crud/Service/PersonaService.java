package com.nuvu.crud.Service;

import com.nuvu.crud.Repositorio.PersonaRepositorio;
import com.nuvu.crud.model.Persona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    
    @Autowired
    private PersonaRepositorio personaRepositorio;
    
    public Persona create (Persona persona){
        return personaRepositorio.save(persona);
    }
    
    public List<Persona> getAllPersonas(){
        try {
            return personaRepositorio.findAll();
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        return personaRepositorio.findAll();
    }
    
    public Optional<Persona> findById(Long id){
        return personaRepositorio.findById(id);
    }
}
