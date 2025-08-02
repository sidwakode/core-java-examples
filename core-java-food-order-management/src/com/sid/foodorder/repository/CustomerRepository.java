package com.sid.foodorder.repository;

import com.sid.foodorder.model.Customer;

import java.util.List;

public interface CustomerRepository {
        void save(Customer customer);
        Customer findById(String id);        // ✅ used in service
        List<Customer> findAll();            // ✅ used in service
        void update(String id, Customer updatedCustomer);
        void delete(String id);
}

