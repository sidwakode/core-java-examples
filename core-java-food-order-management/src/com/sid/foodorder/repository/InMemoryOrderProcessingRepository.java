package com.sid.foodorder.repository;

import com.sid.foodorder.model.OrderProcessing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryOrderProcessingRepository implements OrderProcessingRepository{
    private final Map<String, OrderProcessing> processingMap = new HashMap<>();

    @Override
    public void save(OrderProcessing processing) {
        processingMap.put(processing.getId(), processing);
    }

    @Override
    public OrderProcessing findById(String id) {
        return processingMap.get(id);
    }

    @Override
    public List<OrderProcessing> findAll() {
        return new ArrayList<>(processingMap.values());
    }

    @Override
    public void update(OrderProcessing processing) {
        processingMap.put(processing.getId(), processing);
    }

    @Override
    public void delete(String id) {
        processingMap.remove(id);
    }

}
