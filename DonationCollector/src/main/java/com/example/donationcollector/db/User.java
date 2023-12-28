package com.example.donationcollector.db;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("user")
public record User(
        @Id Long id,
        String username,
        String email,
        @JsonProperty("phone_num")
        String phoneNum,
        String password
) {
}

