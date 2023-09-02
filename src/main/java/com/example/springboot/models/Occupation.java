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
    @Getter  @Column(name = "identifier")
    private Integer identifier;

    @Getter @Setter @Column(name = "title")
    private String title;

    @Getter @Setter @Column(name = "place")
    private String place;

    @Getter @Setter @Column(name = "project")
    private String project;

    @Getter @Setter @Column(name = "old")
    private double old;

    public Integer getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public double getOld() {
        return old;
    }

    public void setOld(double old) {
        this.old = old;
    }
}
