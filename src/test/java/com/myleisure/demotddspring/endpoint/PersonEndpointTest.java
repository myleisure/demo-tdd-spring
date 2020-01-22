package com.myleisure.demotddspring.endpoint;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ExtendWith(SpringExtension.class)
public class PersonEndpointTest {
    @Autowired private WebTestClient testClient;

    @Test void getAll() {
        this.testClient.get()
                .uri("/")
                .exchange()
                .expectStatus()
                .isOk();
    }
}
