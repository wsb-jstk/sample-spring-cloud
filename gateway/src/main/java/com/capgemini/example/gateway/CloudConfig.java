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
                .uri("lb://BW-MAKER"))

                .route(r -> r.path("/adder/**")
                .uri("lb://ADDER"))
                .build();
    }
}
