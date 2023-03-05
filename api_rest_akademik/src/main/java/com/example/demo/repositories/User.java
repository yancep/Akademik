package com.example.demo.repositories;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
public class Usuario {
    @Id
    String id;

    String usuario;
    String contraseña;

    public String getId() {
        return id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}