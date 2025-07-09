package com.dheeraj.food.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dheeraj.food.model.MenuItem;

@Service
public class MenuService {

    private List<MenuItem> menuList = new ArrayList<>();
    private int currentId = 1;

    public List<MenuItem> getAllItems() {
        return menuList;
    }

    public MenuItem addItem(MenuItem item) {
        item.setId(currentId++);
        menuList.add(item);
        return item;
    }

    public MenuItem updateItem(int id, MenuItem updatedItem) {
        for (MenuItem item : menuList) {
            if (item.getId() == id) {
                item.setName(updatedItem.getName());
                item.setDescription(updatedItem.getDescription());
                item.setPrice(updatedItem.getPrice());
                return item;
            }
        }
        return null;
    }

    public boolean deleteItem(int id) {
        return menuList.removeIf(item -> item.getId() == id);
    }
}
