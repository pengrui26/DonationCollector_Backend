package com.example.donationcollector.controller;

import com.example.donationcollector.db.Item;
import com.example.donationcollector.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class ItemController {
    private final ItemService itemService;

    public ItemController(
            ItemService itemService
    ) {
        this.itemService = itemService;

    }


    @GetMapping("/item")
    public List<Item> getItems(@RequestParam(value = "category_name", required = false) String category) {
        if (category == null) {
            return itemService.getItems();
        } else {
            return itemService.getItemsByCategory(category);
        }
    }
}
