package com.sid.foodorder.repository;

import com.sid.foodorder.model.DeliveryAgent;

import java.util.List;

public interface DeliveryAgentRepository {
    void save(DeliveryAgent agent);
    DeliveryAgent findById(String id);
    List<DeliveryAgent> findAll();
    void update(DeliveryAgent agent);
    void delete(String id);
}


