package com.dheeraj.food;

import com.dheeraj.food.model.Customer;
import com.dheeraj.food.model.MenuItem;
import com.dheeraj.food.model.Order;
import com.dheeraj.food.service.CustomerService;
import com.dheeraj.food.service.MenuService;
import com.dheeraj.food.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List; // Make sure this is imported

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private MenuService menuService;

    @Autowired
    private OrderService orderService;

    @Override
    public void run(String... args) throws Exception {
        // Sample Customers
        customerService.addCustomer(new Customer(0, "Aarav Mehta", "aarav@example.com", "Mumbai"));
        

        // Sample Menu Items
        menuService.addMenuItem(new MenuItem(0, "Paneer Tikka", "Spicy grilled paneer cubes", 200.0));
       

        // Sample Orders
        orderService.placeOrder(new Order(0, 1, Arrays.asList(1, 2), LocalDateTime.now(), 380.0));
        
        System.out.println("✅ Sample customers and menu items loaded!");
    }
}
