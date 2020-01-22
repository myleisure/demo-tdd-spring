package com.myleisure.demotddspring.repository;

import com.myleisure.demotddspring.model.Actor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@DataMongoTest
public class PersonRepositoryTest {
    @Autowired
    private PersonRepository repository;

    @Test
    @DisplayName("Test findByName")
    public void findByName() {
        Flux<Actor> flux = Flux.just(
                new Actor("James", "Cameron"),
                new Actor("James", "Wong"),
                new Actor("Denzel", "Washington")
        );

        Flux<Actor> actorFlux = repository.deleteAll().thenMany(
                this.repository.saveAll(flux).thenMany(this.repository.findByFirstName("James"))
        );

        StepVerifier.create(actorFlux)
                .expectNextCount(2)
                .verifyComplete();
    }
}
