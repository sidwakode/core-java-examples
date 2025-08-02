package com.sid.foodorder.repository;

import com.sid.foodorder.model.OrderProcessing;

import java.util.List;

public interface OrderProcessingRepository {

    void save(OrderProcessing processing);
    OrderProcessing findById(String id);
    List<OrderProcessing> findAll();
    void update(OrderProcessing processing);
    void delete(String id);

}
