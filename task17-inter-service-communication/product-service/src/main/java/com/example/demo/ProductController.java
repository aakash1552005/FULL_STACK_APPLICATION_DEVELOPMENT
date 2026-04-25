package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/{id}")
    public String getProduct(@PathVariable String id) {
        return "Product Details for ID: " + id + " (from Product Service)";
    }

    @GetMapping
    public String getAllProducts() {
        return "List of all products (from Product Service)";
    }
}