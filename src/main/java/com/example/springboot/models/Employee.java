package com.example.springboot.models;

//import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Getter //@Column(name = "id")
    private String Id;

    @Getter @Setter //@Column(name = "name")
    private String name;

    @Getter @Setter// @Column(name = "address")
    private String address;

    @Getter @Setter //@Column(name = "phone")
    private String phone;

    @Getter @Setter //@Column(name = "cellphone")
    private String cellphone;

    @Getter @Setter //@Column(name = "type")
    private String type;

    @Getter @Setter //@Column(name = "salary")
    private int salary;

    @Getter @Setter //@Column(name = "age")
    private int age;

    @Getter @Setter //@Column(name = "isLead")
    private boolean isLead;

    @Getter @Setter //@Column(name = "isManager")
    private boolean isManager;

    @Getter @Setter //@Column(name = "level")
    private String level;

    @Getter @Setter //@Column(name = "status")
    private String status;

//    @Getter @Setter //@Column(name = "job")
//    private Occupation job;
//
//    @Getter @Setter //@Column(name = "contacts")
//    private List<Contact> contacts;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLead() {
        return isLead;
    }

    public void setLead(boolean lead) {
        isLead = lead;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
