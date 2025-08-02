package com.sid.foodorder.repository;

import com.sid.foodorder.model.Billing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryBillingRepository implements BillingRepository {

    private final Map<String, Billing> billingMap = new HashMap<>();

    @Override
    public void save(Billing billing) {
        billingMap.put(billing.getId(), billing);
    }

    @Override
    public Billing findById(String id) {
        return billingMap.get(id);
    }

    @Override
    public List<Billing> findAll() {
        return new ArrayList<>(billingMap.values());
    }

    @Override
    public void update(Billing billing) {
        billingMap.put(billing.getId(), billing);
    }

    @Override
    public void delete(String id) {
        billingMap.remove(id);
    }
}


