package com.example.springboot.controllers;

import com.example.springboot.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class RequestEmployee {

    @Autowired
//    private EmployeeDao employeeDao;
    @GetMapping(path="/employee/getAllObjects")
    public List<Employee> getAllEmployee() {
        return new ArrayList<Employee>();
    }

    @GetMapping(path="/employee/getObject/{id}")
    public int getObjectEmployee(@PathVariable("id") int id) {
        return id;
    }

    @PostMapping(path = "/employee/create")
    public void postEmployee(Employee employee){}

    @PutMapping(path = "/employee/update")
    public Employee putEmployee(int id, Employee employee){
        return new Employee();
    }

    @DeleteMapping(path = "/employee/delete")
    public int deleteEmployee(int id){
        return 1;
    }
}
