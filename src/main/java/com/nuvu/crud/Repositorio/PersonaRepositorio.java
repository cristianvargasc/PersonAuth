package com.nuvu.crud.Repositorio;

import com.nuvu.crud.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

 
public interface PersonaRepositorio extends JpaRepository<Persona, Long>{
    
}
