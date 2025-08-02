package com.sid.practice.service;

import com.sid.practice.model.Customer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CustomerService {

    //private ArrayList <Customer>customers=new ArrayList<>();
    private HashSet<Customer> customers=new HashSet<>();

    private Scanner scanner =new Scanner(System.in);


    void printCustomer(Customer customer){
        System.out.println(customer);
    }
    public Customer regesterCustomer(){
        Customer customer=new Customer();
        //Use scanner to Accept the values and set to the customer
        System.out.println("please enter the id");
        int customerId=Integer.parseInt(scanner.nextLine());
        customer.setId(customerId);

        System.out.println("please enter cutomer name");
        String FirstName=scanner.nextLine();
        customer.setFirstname(FirstName);

        customers.add(customer);
         return customer;

    }

    public void displayCustomer(){
        for(Customer  customer: customers) {
            System.out.println("Customer Details are :" +customer);

        }
        }
    }


