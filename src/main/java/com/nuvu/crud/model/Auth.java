
package com.nuvu.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name = "auth")
public class Auth {
    
    @Id    
    @GeneratedValue(strategy= GenerationType.IDENTITY, generator="seq-gen")
    @Column(name="\"id\"",unique=true,nullable=false)
    private Long id;
    public Long getId(){
        return id;
    }    
    public Long setId(Long id){
        return this.id = id;
    }
    
    @Column (name = "user")
    private String User;
    public String getUser(){
        return User;
    }    
    public String setUser(String User){
        return this.User = User;
    }
    
    @Column (name = "token")
    private String Token;
    public String getToken(){
        return Token;
    }    
    public String setToken(String Token){
        return this.Token = Token;
    }
}
