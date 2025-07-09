package com.dheeraj.food.controller;

import com.dheeraj.food.model.Order;
import com.dheeraj.food.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id) {
        return orderService.getOrderById(id);
    }

    @PostMapping
    public Order placeOrder(@RequestBody Order order) {
        return orderService.placeOrder(order);
    }

    @DeleteMapping("/{id}")
    public String cancelOrder(@PathVariable int id) {
        return orderService.cancelOrder(id)
            ? "Order cancelled."
            : "Order not found.";
    }
}
