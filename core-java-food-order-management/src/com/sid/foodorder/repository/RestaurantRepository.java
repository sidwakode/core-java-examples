package com.sid.foodorder.repository;

import com.sid.foodorder.model.Restaurant;

import java.util.List;

public interface RestaurantRepository {
    void save(Restaurant restaurant);
    Restaurant findById(String id);
    List<Restaurant> findAll();
    void update(Restaurant restaurant);
    void delete(String id);
}
