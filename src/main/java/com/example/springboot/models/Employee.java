package com.example.springboot.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Getter @Setter @Column(name = "id")
    private String Id;

    @Getter @Setter @Column(name = "name")
    private String name;

    @Getter @Setter @Column(name = "address")
    private String address;

    @Getter @Setter @Column(name = "phone")
    private String phone;

    @Getter @Setter @Column(name = "cellphone")
    private String cellphone;

    @Getter @Setter @Column(name = "type")
    private String type;

    @Getter @Setter @Column(name = "salary")
    private int salary;

    @Getter @Setter @Column(name = "age")
    private int age;

    @Getter @Setter @Column(name = "isLead")
    private boolean isLead;

    @Getter @Setter @Column(name = "isManager")
    private boolean isManager;

    @Getter @Setter @Column(name = "level")
    private String level;

    @Getter @Setter @Column(name = "status")
    private String status;

    @Getter @Setter @Column(name = "job")
    private Occupation job;

    @Getter @Setter @Column(name = "contacts")
    private List<Contact> contacts;

}
