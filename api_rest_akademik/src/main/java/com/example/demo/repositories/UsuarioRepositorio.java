package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UsuarioRepositorio extends ReactiveMongoRepository<User,String> {
}
