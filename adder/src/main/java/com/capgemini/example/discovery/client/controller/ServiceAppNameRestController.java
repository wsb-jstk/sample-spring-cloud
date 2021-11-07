package com.capgemini.example.discovery.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adder")
class ServiceAppNameRestController {

    private static Logger logger = LoggerFactory.getLogger(ServiceAppNameRestController.class);

    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/name")
    public String serviceApplicationName() {
        logger.info("SLEUTH TEST");
        return "Hi, I'm " + appName + " on " + serverPort;
    }
}
