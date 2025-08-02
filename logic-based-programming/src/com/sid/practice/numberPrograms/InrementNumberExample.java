package com.sid.practice.numberPrograms;

import java.util.Scanner;

public class InrementNumberExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please provide a number: ");
        int number = scanner.nextInt();
        number++;
        System.out.println("incremented number : "+ number);

    }
}

/*
problem statement: we have to increment the provided number by 1

Logic: we can use increment operator to increment the number by 1
 */