package com.dheeraj.food.service;

import com.dheeraj.food.model.MenuItem;
import com.dheeraj.food.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

    @Autowired
    private MenuItemRepository menuRepo;

    public List<MenuItem> getAllMenuItems() {
        return menuRepo.findAll();
    }

    public MenuItem getMenuItemById(int id) {
        Optional<MenuItem> optional = menuRepo.findById(id);
        return optional.orElse(null);
    }

    public MenuItem addMenuItem(MenuItem item) {
        return menuRepo.save(item);
    }

    public MenuItem updateMenuItem(int id, MenuItem updatedItem) {
        updatedItem.setId(id);
        return menuRepo.save(updatedItem);
    }

    public boolean deleteMenuItem(int id) {
        if (menuRepo.existsById(id)) {
            menuRepo.deleteById(id);
            return true;
        }
        return false;
    }
}
