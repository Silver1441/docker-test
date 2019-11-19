package com.kishkan.epam.dockertest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloDockerController.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    public String index() {
        LOGGER.info("index page was requested");
        return "Hello Docker World";
    }

    @RequestMapping("/counter")
    public String counter() {
        LOGGER.info("counter was incremented");
        return String.valueOf(getAndIncrementCounter());
    }

    private int getAndIncrementCounter() {
        String getQuery = "select num from counter where id = 1";
        int counter = jdbcTemplate.queryForObject(getQuery, Integer.class);
        counter = counter + 1;

        String incrementQuery = "update counter set num = " + counter + " where id =1";
        jdbcTemplate.update(incrementQuery);
        return counter;
    }

}
