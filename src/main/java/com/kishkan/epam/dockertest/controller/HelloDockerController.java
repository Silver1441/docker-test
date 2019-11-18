package com.kishkan.epam.dockertest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloDockerController.class);

    @RequestMapping("/")
    public String index() {
        LOGGER.info("index page was requested");
        return "Hello Docker World";
    }

    @RequestMapping("/home")
    public String home() {
        LOGGER.info("index page was requested");
        return "This is starting page";
    }
}
