package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Task14EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Task14EurekaServerApplication.class, args);
    }
}