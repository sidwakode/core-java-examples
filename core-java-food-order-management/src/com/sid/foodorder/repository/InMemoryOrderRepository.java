package com.sid.foodorder.repository;

import com.sid.foodorder.model.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class InMemoryOrderRepository implements OrderRepository{
    private final Map<String, Order> orderMap = new HashMap<>();

    @Override
    public void save(Order order) {
        orderMap.put(order.getId(), order);
    }

    @Override
    public Order findById(String id) {
        return orderMap.get(id);
    }

    @Override
    public List<Order> findAll() {
        return new ArrayList<>(orderMap.values());
    }

    @Override
    public void update(Order order) {
        orderMap.put(order.getId(), order);
    }

    @Override
    public void delete(String id) {
        orderMap.remove(id);
    }
}

