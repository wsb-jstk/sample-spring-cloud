package com.capgemini.example.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/bw-maker/**")
                .uri("http://localhost:8763"))

                .route(r -> r.path("/adder/**")
                .uri("http://localhost:8762"))
                .build();
    }
}
