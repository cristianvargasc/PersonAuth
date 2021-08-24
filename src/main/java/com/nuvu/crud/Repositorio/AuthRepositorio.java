package com.nuvu.crud.Repositorio;

import com.nuvu.crud.model.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepositorio  extends JpaRepository<Auth, Long>{
    
}
