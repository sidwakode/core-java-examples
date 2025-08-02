package com.sidw.practice.rating.system.service;

import com.sidw.practice.rating.system.model.User;

import java.util.Scanner;

public class UserService {

    public User acceptUserData(){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter User Id:");
        int id=Integer.parseInt(scanner.nextLine());

        System.out.println("Please Enter User FirstName:");
        String firstname=scanner.nextLine();

        System.out.println("Please Enter User LastName:");
        String lastname=scanner.nextLine();

        //Now we have to initilize the entity

        User user= new User();
        user.id=id;
        user.firstname=firstname;
        user.lastname=lastname;
        return user;




    }
}
