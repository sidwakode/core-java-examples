package com.sidw.practice.rating.system.model;

public class User {
    public int id;
    public String firstname;
    public String lastname;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
