package com.sid.foodorder.service;

import com.sid.foodorder.model.Restaurant;

import java.util.List;

public interface RestaurantService {
        void register(Restaurant restaurant);
        void update(Restaurant restaurant);
        Restaurant getById(String id);
        List<Restaurant> getAll();
        void delete(String id);
    }



