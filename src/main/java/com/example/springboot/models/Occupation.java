package com.example.springboot.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "occupation")
public class Occupation {

    @Id
    @Getter @Setter @Column(name = "identifier")
    private int identifier;

    @Getter @Setter @Column(name = "title")
    private String title;

    @Getter @Setter @Column(name = "place")
    private String place;

    @Getter @Setter @Column(name = "project")
    private String project;

    @Getter @Setter @Column(name = "old")
    private double old;


}
