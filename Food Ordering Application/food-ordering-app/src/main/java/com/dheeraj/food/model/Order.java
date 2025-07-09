package com.dheeraj.food.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")  // ✅ Avoid reserved keyword 'order'
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int customerId;

    @ElementCollection
    private List<Integer> menuItemIds;

    private LocalDateTime timestamp;

    private double total;

    // Constructors
    public Order() {
        this.timestamp = LocalDateTime.now();  // auto-set timestamp
    }

    public Order(int customerId, List<Integer> menuItemIds, double total) {
        this.customerId = customerId;
        this.menuItemIds = menuItemIds;
        this.total = total;
        this.timestamp = LocalDateTime.now();  // auto-set timestamp
    }

    // Getters and Setters
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
