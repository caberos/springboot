package com.example.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprintApplication {

    private static final Logger log = LoggerFactory.getLogger(SprintApplication.class);


    public static void main(String[] args) {

        SpringApplication.run(SprintApplication.class, args);


    }

}
