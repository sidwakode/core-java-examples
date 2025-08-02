package com.sid.foodorder.controller;

import com.sid.foodorder.model.Customer;
import com.sid.foodorder.service.CustomerService;
import com.sid.foodorder.service.CustomerServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerController {
    private List<Customer> customerList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void registerCustomer() {
        System.out.println("\n🔹 Registering New Customer");
        System.out.print("Enter Customer ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(id, name, phone, address);
        customerList.add(customer);
        System.out.println("✅ Customer registered successfully!");
    }

    public void updateCustomerDetails() {
        System.out.print("\nEnter Customer ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Customer c : customerList) {
            if (c.getId() == id) {
                System.out.print("Enter New Name: ");
                c.setName(scanner.nextLine());

                System.out.print("Enter New Phone Number: ");
                c.setPhone(scanner.nextLine());

                System.out.print("Enter New Address: ");
                c.setAddress(scanner.nextLine());

                System.out.println("✅ Customer details updated.");
                return;
            }
        }
        System.out.println("❌ Customer not found!");
    }

    public void displayAllCustomers() {
        System.out.println("\n📋 All Registered Customers:");
        if (customerList.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            for (Customer c : customerList) {
                System.out.println("ID: " + c.getId() +
                        ", Name: " + c.getName() +
                        ", Phone: " + c.getPhone() +
                        ", Address: " + c.getAddress());
            }
        }
    }
}