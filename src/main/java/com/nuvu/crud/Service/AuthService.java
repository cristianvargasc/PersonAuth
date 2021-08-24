package com.nuvu.crud.Service;

import com.nuvu.crud.Repositorio.AuthRepositorio;
import com.nuvu.crud.model.Auth;
import java.util.Optional;
import javax.persistence.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    
    @Autowired
    private AuthRepositorio authRepositorio;
    
    public boolean Auth(String token){
        Auth auth = new Auth();
        Integer id = 1;
        
        auth.setId(Long.parseLong(id.toString()));
        auth.setUser("Admin");
        auth.setToken(token);
        
        Optional<Auth> temp = authRepositorio.findById(Long.parseLong(id.toString()));
        
        String autenticacion = temp.map(Auth::getToken).orElse("NULL");
        
        if (autenticacion.equals(token)) {
            return true;
        }else{
            return false;
        }        
    }
    
    public Optional<Auth> findById(Integer id){
        id = 1;
        Optional<Auth> temp = authRepositorio.findById(Long.parseLong(id.toString()));
        
        
                
        return authRepositorio.findById(Long.parseLong(id.toString()));
    }
}
