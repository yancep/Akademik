package com.example.demo.services;

import com.example.demo.repositories.User;
import com.mongodb.client.MongoIterable;
import org.reactivestreams.Publisher;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<User> insert(User entity);
    Mono<User> save(User entity);
    Flux<User> saveAll(Publisher entityStream);
    Mono<User> findById(String o);
    Mono<Boolean> existsById(String o);
    Flux<User> findAll();
    Mono<Long> count();
    Mono<Void> deleteById(String o);
    Mono<Void> deleteById(Publisher id);
    Mono<Void> delete(User entity);
    Mono<Void> deleteAllById(Iterable iterable);
    Mono<Void> deleteAll(Iterable entities);
    Mono<Void> deleteAll(Publisher entityStream);
    Mono<Void> deleteAll();

}
