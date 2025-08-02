package com.sidwa.practice.service;

import com.sidwa.practice.model.Person;

import java.util.Scanner;

public class GovtSchemeDemoApplication {
    public static void main(String[] args) {
        //By using this we can take input from the user

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String FirstName=scanner.nextLine();

        System.out.println("Enter Last Name: ");
        String LastName=scanner.nextLine();

        System.out.println("Enter  Age: ");
        int age=Integer.parseInt(scanner.nextLine());

        Person person=new Person();
        person.FirstName=FirstName;
        person.LastName=LastName;
        person.age=age;

        System.out.println("person Details Recived From The System :" +person);

    }
}
