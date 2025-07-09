package com.dheeraj.food.controller;

import com.dheeraj.food.model.Customer;
import com.dheeraj.food.model.MenuItem;
import com.dheeraj.food.model.Order;
import com.dheeraj.food.service.CustomerService;
import com.dheeraj.food.service.MenuService;
import com.dheeraj.food.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private MenuService menuService;

    @Autowired
    private OrderService orderService;

    // ✅ View all customers
    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    // ✅ View all menu items
    @GetMapping("/menu")
    public List<MenuItem> getAllMenuItems() {
        return menuService.getAllMenuItems();  // fixed method name
    }

    // ✅ View all orders
    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    // 🗑️ Delete a customer
    @DeleteMapping("/customers/{id}")
    public String deleteCustomer(@PathVariable int id) {
        return customerService.deleteCustomer(id)
                ? "✅ Customer deleted"
                : "❌ Customer not found";
    }

    // 🗑️ Delete a menu item
    @DeleteMapping("/menu/{id}")
    public String deleteMenuItem(@PathVariable int id) {
        return menuService.deleteMenuItem(id)
                ? "✅ Menu item deleted"
                : "❌ Menu item not found";
    }
}
