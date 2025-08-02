package com.sidwa.operator.increment;

import java.util.Scanner;

public class IncrementOperatorDemo {
    public static void main(String[] args) {
        /*
    psudo code;
    accept 2 value from the user
    increment the value by 1
     */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the value");
        int value=Integer.parseInt(scanner.nextLine());

        System.out.println("Incremented value: "+(value+1));

    }
}


