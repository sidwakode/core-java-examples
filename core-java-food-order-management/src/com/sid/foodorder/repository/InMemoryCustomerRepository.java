package com.sid.foodorder.repository;

import com.sid.foodorder.model.Customer;

import java.util.*;

public class InMemoryCustomerRepository implements CustomerRepository {

     private final Map<String, Customer> customerDB = new HashMap<>();

    @Override
    public void save(Customer customer) {
        customerDB.put(String.valueOf(customer.getId()), customer);
    }

    @Override
    public Customer findById(String id) {
        return customerDB.get(id);
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerDB.values());
    }

    @Override
    public void update(String id, Customer updatedCustomer) {
        customerDB.put(id, updatedCustomer);
    }

    @Override
    public void delete(String id) {
        customerDB.remove(id);
    }
}

