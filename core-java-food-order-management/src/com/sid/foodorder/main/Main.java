package com.sid.foodorder.main;

import com.sid.foodorder.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Customer> customerList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Customer Management Menu ---");
            System.out.println("1. Register Customer");
            System.out.println("2. Update Customer Details");
            System.out.println("3. View All Customers");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    registerCustomer();
                    break;
                case 2:
                    updateCustomerDetails();
                    break;
                case 3:
                    viewAllCustomers();
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        }
    }

    public static void registerCustomer() {
        System.out.print("Enter Customer ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Customer Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Enter Customer Address: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(id, name, phone, address);
        customerList.add(customer);
        System.out.println("✅ Customer registered successfully!");
    }

    public static void updateCustomerDetails() {
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

    public static void viewAllCustomers() {
        if (customerList.isEmpty()) {
            System.out.println("⚠️ No customers found.");
            return;
        }

        System.out.println("\n--- All Registered Customers ---");
        for (Customer c : customerList) {
            System.out.println("ID: " + c.getId() + ", Name: " + c.getName() +
                    ", Phone: " + c.getPhone() + ", Address: " + c.getAddress());
        }
    }
}