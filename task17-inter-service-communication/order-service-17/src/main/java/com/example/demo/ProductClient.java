package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "product-service", fallback = ProductClientFallback.class)
public interface ProductClient {

    @GetMapping("/products/{id}")
    String getProduct(@PathVariable("id") String id);

    @GetMapping("/products")
    String getAllProducts();
}