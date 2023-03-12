package com.example.demo.repositories;


import com.mongodb.lang.NonNull;
import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "users")
public class User {
    @Id
    String id;
    String usuario;
    String contraseña;
    String nombre;
    String email;
    String facultad;
    String grupo;
    int año;
}
