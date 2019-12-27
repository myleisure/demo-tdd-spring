package com.myleisure.demotddspring.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ActorPojoTest {

    @Test public void getActorPojo() {
        Actor actor = Actor.builder()
                .id("0")
                .firstName("Jack")
                .lastName("Reacher")
                .build();

        assertThat(actor.getFirstName()).isEqualTo("Jack");
        assertThat(actor.getLastName()).isEqualToIgnoringCase("reacher");
        assertThat(actor.getId()).isEqualTo("0");
    }
}
