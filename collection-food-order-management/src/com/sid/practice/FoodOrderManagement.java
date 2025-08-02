package com.sid.practice;

import com.sid.practice.model.Customer;
import com.sid.practice.service.CustomerService;

import java.util.Scanner;

public class FoodOrderManagement {
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        CustomerService customerService= new CustomerService();


        System.out.println("-----Welcome to Food Order Management-----");
        int option=0;
        do {
            System.out.println("1.Create Customer:    ");
            System.out.println("2.Display all customer:");
            option=Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1:
                    //create Costomer
                    customerService.regesterCustomer();
                    break;

                case 2:
                    customerService.displayCustomer();
                    break;

                default:
                    System.out.println("Invalid customer");





            }
        }
        while (option !=0);




    }
}