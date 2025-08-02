package com.sidwa.operator.relational;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PostiveNegitiveDemo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please Provide  Number :");
        int num=Integer.parseInt(scanner.nextLine());


        if(num>=0){
            System.out.println("Positive number or zero");
        }
        else {
            System.out.println("Negetive number");
        }

    }
}
