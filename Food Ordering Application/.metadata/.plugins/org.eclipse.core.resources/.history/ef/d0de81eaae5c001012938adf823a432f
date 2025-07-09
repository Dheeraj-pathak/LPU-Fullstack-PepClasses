package com.dheeraj.food.model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private int id;
    private int customerId;
    private List<Integer> menuItemIds;
    private LocalDateTime timestamp;
    private double total;

    public Order() {}

    public Order(int id, int customerId, List<Integer> menuItemIds, LocalDateTime timestamp, double total) {
        this.id = id;
        this.customerId = customerId;
        this.menuItemIds = menuItemIds;
        this.timestamp = timestamp;
        this.total = total;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }

    public List<Integer> getMenuItemIds() { return menuItemIds; }
    public void setMenuItemIds(List<Integer> menuItemIds) { this.menuItemIds = menuItemIds; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
}
