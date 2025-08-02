package com.sidwa.practice.model;

public class Person {
    public String FirstName;
    public String LastName;
    public int age;

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                '}';
    }
}
