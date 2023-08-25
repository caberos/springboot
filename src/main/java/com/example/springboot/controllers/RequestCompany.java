package com.example.springboot.controllers;

import com.example.springboot.models.Company;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RequestCompany {
    @GetMapping(path = "/company/getAllObjects")
    public List<Company> getAll() {
        return new ArrayList<Company>();
    }

    @GetMapping(path = "/company/getObject/{id}")
    public Company getObject(@PathVariable("id") int id) {
        return new Company();
    }

    @PostMapping("/company/add")
    public void post(Company company) {

    }

    @PutMapping("/company/update")
    public Company put(int id, Company company) {
        return new Company();
    }

    @DeleteMapping("/company/delete")
    public void delete(int id) {
    }
}
