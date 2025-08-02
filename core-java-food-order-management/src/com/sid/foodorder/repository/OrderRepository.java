package com.sid.foodorder.repository;

import com.sid.foodorder.model.Order;

import java.util.List;

public interface OrderRepository {
    void save(Order order);
    Order findById(String id);
    List<Order> findAll();
    void update(Order order);
    void delete(String id);
}


