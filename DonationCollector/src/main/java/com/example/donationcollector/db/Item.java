package com.example.donationcollector.db;



import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("item")
public record Item(
        @Id Long id,
        Size size,
        String category,
        @JsonProperty("photo_url") String photoUrl,
        String address,
        String time,
        @JsonProperty("user_id") Long userId
){

}
