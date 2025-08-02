package com.sidwa.operator.stringconcat;

import java.util.Scanner;

public class StringConcatDemo {

    public static void main(String[] args) {

        //Concatination of two String

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Provide First String:");
        String s1=scanner.nextLine();

        System.out.println("Please Provide Second String:");
        String s2=scanner.nextLine();

        System.out.println("output: " + (s1 + s2));

    }
}
