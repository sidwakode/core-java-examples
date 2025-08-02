package com.sid.foodorder.repository;

import com.sid.foodorder.model.DeliveryAgent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class InMemoryDeliveryAgentRepository implements DeliveryAgentRepository {
    private final Map<String, DeliveryAgent> deliveryAgentMap = new HashMap<>();

    @Override
    public void save(DeliveryAgent agent) {
        deliveryAgentMap.put(agent.getId(), agent);
    }

    @Override
    public DeliveryAgent findById(String id) {
        return deliveryAgentMap.get(id);
    }

    @Override
    public List<DeliveryAgent> findAll() {
        return new ArrayList<>(deliveryAgentMap.values());
    }

    @Override
    public void update(DeliveryAgent agent) {
        deliveryAgentMap.put(agent.getId(), agent);
    }

    @Override
    public void delete(String id) {
        deliveryAgentMap.remove(id);
    }
}

