package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private Environment environment;

    @GetMapping("/users")
    public String getUsers() {
        String port = environment.getProperty("local.server.port");
        return "User Service response from port: " + port;
    }
}