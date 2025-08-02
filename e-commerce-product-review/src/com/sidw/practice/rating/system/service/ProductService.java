package com.sidw.practice.rating.system.service;

import com.sidw.practice.rating.system.model.Product;
import com.sidw.practice.rating.system.model.User;

import java.util.Scanner;

public class ProductService {
    public Product acceptProductData(){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter product Id:");
        int id=Integer.parseInt(scanner.nextLine());

        System.out.println("Please Enter product Name:");
        String name=scanner.nextLine();

        System.out.println("Please Enter product Price:");
        Double price=scanner.nextDouble();


        //Now we have to initilize the entity

        Product product= new Product();
        product.id=id;
        product.name=name;
        product.price=price;
        return product;




    }
}
