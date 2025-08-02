package com.sid.foodorder.repository;

import com.sid.foodorder.model.Billing;

import java.util.List;

public interface BillingRepository {
    void save(Billing billing);
    Billing findById(String id);
    List<Billing> findAll();
    void update(Billing billing);
    void delete(String id);
}

