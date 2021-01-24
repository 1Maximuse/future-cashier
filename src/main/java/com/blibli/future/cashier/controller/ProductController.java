package com.blibli.future.cashier.controller;

import com.blibli.future.cashier.controller.model.request.CreateOrderRequest;
import com.blibli.future.cashier.entity.Order;
import com.blibli.future.cashier.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private OrderServiceImpl productService;

    @GetMapping("/orders/{id}")
    public Order getOrderById(@PathVariable int id) {
        return productService.getOrderById(id);
    }

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return productService.getOrders();
    }

    @PostMapping("/orders")
    public Order createOrder(@RequestBody CreateOrderRequest createOrderRequest) {
        return productService.createOrder(createOrderRequest);
    }
}
