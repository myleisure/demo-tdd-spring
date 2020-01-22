package com.myleisure.demotddspring.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@DataMongoTest
public class ActorPojoTest {

    @Autowired
    private ReactiveMongoTemplate template;

    @Test
    public void save() {
        Actor a = new Actor("James", "Cameron");
        Mono<Actor> save = template.save(Mono.just(a));
        StepVerifier.create(save)
                .expectNextMatches(actor -> actor.getId() != null)
                .verifyComplete();
    }
}
