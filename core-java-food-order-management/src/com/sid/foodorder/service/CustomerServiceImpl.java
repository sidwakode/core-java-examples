package com.sid.foodorder.service;

import com.sid.foodorder.model.Customer;
import com.sid.foodorder.repository.CustomerRepository;
import com.sid.foodorder.repository.InMemoryCustomerRepository;

import java.util.List;


public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl() {
        this.customerRepository = new InMemoryCustomerRepository(); // You can later inject any implementation
    }

    @Override
    public void registerCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(String id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void updateCustomer(String id, Customer updatedCustomer) {
        customerRepository.update(id, updatedCustomer);
    }

    @Override
    public void deleteCustomerById(String id) {
        Customer existing = customerRepository.findById(id);
        if (existing != null) {
            customerRepository.delete(id);
        } else {
            System.out.println("❌ Customer with ID " + id + " not found!");
        }
    }

}

