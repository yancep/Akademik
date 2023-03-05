package com.example.demo.repositories;

import com.example.demo.repositories.Usuario;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UsuarioRepositorio extends ReactiveMongoRepository<Usuario,String> {
}
