package com.dheeraj.food.controller;

import com.dheeraj.food.model.MenuItem;
import com.dheeraj.food.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
@CrossOrigin
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    public List<MenuItem> getAllMenuItems() {
        return menuService.getAllMenuItems();
    }

    @GetMapping("/{id}")
    public MenuItem getMenuItemById(@PathVariable int id) {
        return menuService.getMenuItemById(id);
    }

    @PostMapping
    public MenuItem addMenuItem(@RequestBody MenuItem item) {
        return menuService.addMenuItem(item);
    }

    @PutMapping("/{id}")
    public MenuItem updateMenuItem(@PathVariable int id, @RequestBody MenuItem item) {
        return menuService.updateMenuItem(id, item);
    }

    @DeleteMapping("/{id}")
    public String deleteMenuItem(@PathVariable int id) {
        return menuService.deleteMenuItem(id)
            ? "Menu item deleted."
            : "Item not found.";
    }
}
