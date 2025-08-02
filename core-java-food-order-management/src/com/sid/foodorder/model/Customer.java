package com.sid.foodorder.model;

public class Customer {
        private int id;
        private String name;
        private String phone;
        private String address;

        // Constructor
        public Customer(int id, String name, String phone, String address) {
            this.id = id;
            this.name = name;
            this.phone = phone;
            this.address = address;
        }

        // Getters
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public String getAddress() {
            return address;
        }

        // Setters
        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        // toString method
        @Override
        public String toString() {
            return "Customer [ID=" + id + ", Name=" + name + ", Phone=" + phone + ", Address=" + address + "]";
        }
    }


//Note:
//Each class every field is private to achive encapsulation
//also each field is having getter and setter method for acceing the data outside with validation
//and having toString method to access data outside,
// for paymentDetails we dont need to provide toSting(),and contructor
