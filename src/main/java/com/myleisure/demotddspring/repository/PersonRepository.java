package com.myleisure.demotddspring.repository;

import com.myleisure.demotddspring.model.Actor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface PersonRepository extends ReactiveCrudRepository<Actor, String> {

    Flux<Actor> findByFirstName(String firstname);
}
