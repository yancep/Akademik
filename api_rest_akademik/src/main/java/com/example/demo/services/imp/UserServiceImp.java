package com.example.demo.services.imp;

import com.example.demo.repositories.User;
import com.example.demo.repositories.UsuarioRepositorio;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    @Override
    public Mono<User> insert(User entity) {
        return usuarioRepositorio.insert(entity);
    }
    @Override
    public Mono<User> save(User entity) {
        return usuarioRepositorio.save(entity);
    }

    @Override
    public Flux<User> saveAll(Publisher entityStream) {
        return usuarioRepositorio.saveAll(entityStream);
    }

    @Override
    public Mono<User> findById(String o) {
        return usuarioRepositorio.findById(o);
    }

    @Override
    public Mono<Boolean> existsById(String o) {
        return usuarioRepositorio.existsById(o);
    }

    @Override
    public Flux<User> findAll() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public Mono<Long> count() {
        return usuarioRepositorio.count();
    }

    @Override
    public Mono<Void> deleteById(String o) {
        return usuarioRepositorio.deleteById(o);
    }

    @Override
    public Mono<Void> deleteById(Publisher id) {
        return usuarioRepositorio.deleteById(id);
    }

    @Override
    public Mono<Void> delete(User entity) {
        return usuarioRepositorio.delete(entity);
    }

    @Override
    public Mono<Void> deleteAllById(Iterable iterable) {
        return usuarioRepositorio.deleteAllById(iterable);
    }

    @Override
    public Mono<Void> deleteAll(Iterable entities) {
        return usuarioRepositorio.deleteAll(entities);
    }

    @Override
    public Mono<Void> deleteAll(Publisher entityStream) {
        return usuarioRepositorio.deleteAll(entityStream);
    }

    @Override
    public Mono<Void> deleteAll() {
        return usuarioRepositorio.deleteAll();
    }

}
