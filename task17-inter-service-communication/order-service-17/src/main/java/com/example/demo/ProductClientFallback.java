package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ProductClientFallback implements ProductClient {

    @Override
    public String getProduct(String id) {
        return "Product Service is unavailable. Please try again later.";
    }

    @Override
    public String getAllProducts() {
        return "Product Service is unavailable. Please try again later.";
    }
}