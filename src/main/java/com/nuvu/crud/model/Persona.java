package com.nuvu.crud.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity 
@Table (name = "person")
public class Persona {

    public Persona(){}
    
    @Id
    //@SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN"initialValue=205, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.IDENTITY, generator="seq-gen")
    @Column(name="\"id\"",unique=true,nullable=false)
    private Long id;
    public Long getId(){
        return id;
    }    
    public Long setId(Long id){
        return this.id = id;
    }
    
    @Column (name = "cedula")
    private Long Cedula;
    public Long getCedula(){
        return Cedula;
    }    
    public Long setCedula(Long Cedula){
        return this.Cedula = Cedula;
    }
    
    @Column (name = "nombre")
    private String Nombre;
    public String getNombre(){
        return Nombre;
    }    
    public String setNombre(String Nombre){
        return this.Nombre = Nombre;
    }
    
    @Column (name = "correo")
    private String Correo;
    public String getCorreo(){
        return Correo;
    }    
    public String setCorreo(String Correo){
        return this.Correo = Correo;
    }
    
    @Column (name = "telefono")
    private Long Telefono;
    public Long getTelefono(){
        return Telefono;
    }    
    public Long setTelefono(Long Telefono){
        return this.Telefono = Telefono;
    }
    
    @Column (name = "numero_tarjeta")
    private Long NumeroTarjeta;
    public Long getNumeroTarjeta(){
        return NumeroTarjeta;
    }    
    public Long setNumeroTarjeta(Long NumeroTarjeta){
        return this.NumeroTarjeta = NumeroTarjeta;
    }
    
    @Column (name = "fecha_ven")
    private String FechaVen;
    public String getFechaVen(){
        return FechaVen;
    }    
    public String setFechaVen(String FechaVen){
        return this.FechaVen = FechaVen;
    }
    
    @Column (name = "franquicia")
    private String Franquicia;
    public String getFranquicia(){
        return Franquicia;
    }    
    public String setFranquicia(String Franquicia){
        return this.Franquicia = Franquicia;
    }
    
    public Persona(Long id, Long cedula, String nombre, String correo, Long telefono, Long numero_tarjeta, String fecha_ven, String franquicia){
        this.id = id;
        this.Cedula = cedula;
        this.Nombre = nombre;
        this.Correo = correo;
        this.Telefono = telefono;
        this.NumeroTarjeta = numero_tarjeta;
        this.FechaVen = fecha_ven;
        this.Franquicia = franquicia;
    }
}
