package com.example.donationcollector.repository;


import com.example.donationcollector.db.Item;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;


public interface ItemRepository extends ListCrudRepository<Item, Long> {


    // SELECT * FROM carts WHERE customer_id = :customerId

    @Query("SELECT * FROM item")
    List<Item> getAllItems();

    @Query("SELECT * FROM item WHERE category = : cate")
    List<Item> findByCategory (String cate);
}

