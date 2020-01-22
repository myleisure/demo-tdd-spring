package com.myleisure.demotddspring.endpoint;

import com.myleisure.demotddspring.model.Actor;
import com.myleisure.demotddspring.repository.PersonRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Mono;

@Configuration
public class PersonEndPoint {

    @Bean
    public RouterFunction<ServerResponse> route(PersonRepository repository) {
        return RouterFunctions.route()
                .GET("/", request -> ServerResponse.ok().body(repository.findAll(), Actor.class))
                .build();
    }
}
