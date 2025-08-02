package com.sid.foodorder.service;

import com.sid.foodorder.model.Restaurant;
import com.sid.foodorder.repository.RestaurantRepository;

import java.util.List;

public class RestaurantServiceImpl implements RestaurantService{
    private final RestaurantRepository repository;

    public RestaurantServiceImpl(RestaurantRepository repository) {
        this.repository = repository;
    }

    @Override
    public void register(Restaurant restaurant) {
        repository.save(restaurant);
    }

    @Override
    public void update(Restaurant restaurant) {
        repository.update(restaurant);
    }

    @Override
    public Restaurant getById(String id) {
        return repository.findById(id);
    }

    @Override
    public List<Restaurant> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(String id) {
        repository.delete(id);
    }
}