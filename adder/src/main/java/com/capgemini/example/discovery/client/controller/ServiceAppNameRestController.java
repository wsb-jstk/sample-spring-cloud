package com.capgemini.example.discovery.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adder")
class ServiceAppNameRestController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/name")
    public String serviceApplicationName() {
        return "Hi, I'm " + appName + " on " + serverPort;
    }
}
