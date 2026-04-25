package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id) {
        return "User Details for ID: " + id + " (from Identity Service)";
    }
}