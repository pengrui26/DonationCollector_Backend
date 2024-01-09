package com.example.donationcollector.repository;

import com.example.donationcollector.db.Item;
import com.example.donationcollector.db.Size;
import com.example.donationcollector.db.Category;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ItemRepository extends ListCrudRepository<Item, Long> {
    List<Item> findBySize(Size size);

    List<Item> findByCategory(Category category);

    Item findByPhotoUrl(String photoUrl);

    List<Item> findByAddress(String address);

    List<Item> findByTime(String time);

    List<Item> findByUserId (Long userId);

    @Modifying
    @Query("INSERT INTO sys.item (id, size, category, photo_url, address, time, user_id) " +
            "VALUES (:id, :size, :category, :photoUrl, :address, :time, :userId)")
    void insertItem(Long id, Size size, Category category, String photoUrl, String address,
                    String time, Long userId);

}
