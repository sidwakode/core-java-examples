package com.sid.foodorder.repository;

import com.sid.foodorder.model.Restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryRestaurantRepository implements RestaurantRepository {
    private final Map<String, Restaurant> restaurantMap = new HashMap<>();

    @Override
    public void save(Restaurant restaurant) {
        restaurantMap.put(restaurant.getId(), restaurant);
    }

    @Override
    public Restaurant findById(String id) {
        return restaurantMap.get(id);
    }

    @Override
    public List<Restaurant> findAll() {
        return new ArrayList<>(restaurantMap.values());
    }

    @Override
    public void update(Restaurant restaurant) {
        restaurantMap.put(restaurant.getId(), restaurant);
    }

    @Override
    public void delete(String id) {
        restaurantMap.remove(id);
    }
}


