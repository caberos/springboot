package com.example.springboot.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @Getter @Setter @Column(name = "identifier")
    private String identifier;

    @Getter @Setter @Column(name = "name")
    private String name;

    @Getter @Setter @Column(name = "address")
    private String address;

    @Getter @Setter @Column(name = "phone")
    private String phone;

    @Getter @Setter @Column(name = "cellphone")
    private String cellphone;

    @Getter @Setter @Column(name = "relationship")
    private String relationship;
}
