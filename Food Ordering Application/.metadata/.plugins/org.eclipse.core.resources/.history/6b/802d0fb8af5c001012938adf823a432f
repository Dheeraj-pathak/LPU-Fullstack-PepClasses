package com.dheeraj.food.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dheeraj.food.model.Order;

@Service
public class OrderService {

    private List<Order> orders = new ArrayList<>();
    private int currentId = 1;

    public List<Order> getAllOrders() {
        return orders;
    }

    public Order placeOrder(Order order) {
        order.setId(currentId++);
        order.setTimestamp(LocalDateTime.now());
        orders.add(order);
        return order;
    }

    public boolean cancelOrder(int id) {
        return orders.removeIf(o -> o.getId() == id);
    }
}
