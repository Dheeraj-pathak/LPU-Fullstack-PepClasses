package com.dheeraj.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dheeraj.food.model.Order;
import com.dheeraj.food.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    public Order placeOrder(@RequestBody Order order) {
        return orderService.placeOrder(order);
    }

    @DeleteMapping("/{id}")
    public String cancelOrder(@PathVariable int id) {
        boolean success = orderService.cancelOrder(id);
        return success ? "Order cancelled successfully" : "Order not found";
    }
}
