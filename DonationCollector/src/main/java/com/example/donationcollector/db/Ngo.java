package com.example.donationcollector.db;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table("ngo")
public record Ngo(
        @Id Long id,
        @JsonProperty("phone_num") String phoneNum,
        String password
) {
}

