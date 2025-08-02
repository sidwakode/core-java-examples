    package com.sid.foodorder.service;

    import com.sid.foodorder.model.Customer;

    import java.util.List;

    public interface CustomerService {
        void registerCustomer(Customer customer);
        Customer getCustomerById(String id);
        List<Customer> getAllCustomers();
        void updateCustomer(String id, Customer updatedCustomer);
        void deleteCustomerById(String id);
    }


