package com.example.donationcollector.db;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.example.donationcollector.db.Size;
import com.example.donationcollector.db.Category;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Table("item")
public record Item(
        @Id Long id,
        Size size,
        Category category,
        @JsonProperty("photo_url") String photoUrl,
        String address,
        String time,
        @JsonProperty("user_id") Long userId
){

    public void insertItem(Long id, Size size, Category category, String photoUrl, String address, String time, Long userId) {
    }
}
