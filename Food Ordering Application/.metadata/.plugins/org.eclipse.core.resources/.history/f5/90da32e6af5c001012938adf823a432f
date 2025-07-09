package com.dheeraj.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dheeraj.food.model.MenuItem;
import com.dheeraj.food.service.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    public List<MenuItem> getAllItems() {
        return menuService.getAllItems();
    }

    @PostMapping
    public MenuItem addItem(@RequestBody MenuItem item) {
        return menuService.addItem(item);
    }

    @PutMapping("/{id}")
    public MenuItem updateItem(@PathVariable int id, @RequestBody MenuItem item) {
        return menuService.updateItem(id, item);
    }

    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable int id) {
        boolean removed = menuService.deleteItem(id);
        return removed ? "Item deleted successfully" : "Item not found";
    }
}
