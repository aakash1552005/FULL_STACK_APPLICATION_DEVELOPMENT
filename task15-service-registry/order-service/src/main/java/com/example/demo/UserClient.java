package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "identity-service")
public interface UserClient {

    @GetMapping("/users/{id}")
    String getUserInfo(@PathVariable("id") String id);
}