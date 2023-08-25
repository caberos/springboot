package com.example.springboot.models;

public class Company {
    private String name;
    private String address;
    private String phone;
    private int numberEmployees;

    public Company() {
        name = "test";

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company(String name, String address, String phone, int numberEmployees) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.numberEmployees = numberEmployees;
    }
}
