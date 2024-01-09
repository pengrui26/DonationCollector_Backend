package com.example.donationcollector;

import com.example.donationcollector.db.Category;
import com.example.donationcollector.db.Item;
import com.example.donationcollector.db.Size;
import com.example.donationcollector.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DevRunner implements CommandLineRunner {

    @Autowired
    private ItemRepository item;

    @Override
    public void run(String... args) throws Exception {
        Long id = 123L;
        Size size = Size.MEDIUM; // 替换为您的实际 Size 枚举
        Category category = Category.Category1;
        String photoUrl = "http://example.com/photo.jpg";
        String address = "123 Main St";
        String time = "2024-01-08 10:00:00";
        Long userId = 1L;

        item.insertItem(id, size, category, photoUrl, address, time, userId);

    }
}