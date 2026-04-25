package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private ProductClient productClient;

    @GetMapping("/{orderId}/product/{productId}")
    public String getOrder(@PathVariable String orderId, @PathVariable String productId) {
        String productInfo = productClient.getProduct(productId);
        return "Order #" + orderId + " contains: " + productInfo;
    }

    @GetMapping("/all-products")
    public String getAllProducts() {
        return productClient.getAllProducts();
    }
}