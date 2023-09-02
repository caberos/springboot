package com.example.springboot.controllers;

import com.example.springboot.models.Employee;
import com.example.springboot.repo.EmployeeRepo;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RequestEmployee extends RequestPatter {

    @Autowired
    private EmployeeRepo employeeDao;

    @GetMapping(path = "/employee/getAllObjects")
    public String getAll() {
        log.info(gson.toJson(employeeDao.findAll()));
        return gson.toJson(employeeDao.findAll());
    }

    @GetMapping(path = "/employee/getObject/{id}")
    public String getObject(@PathVariable("id") Integer id) {
        log.info(gson.toJson(employeeDao.findById(Long.valueOf(id)).get()));
        return gson.toJson(employeeDao.findById(Long.valueOf(id)).get());
    }


    @PostMapping(path = "/employee/create")
    public void postEmployee(@RequestBody Employee employee) {
        employeeDao.save(employee);
    }

    @PutMapping(path = "/employee/update/{id}")
    public Employee putEmployee(@PathVariable("id") int id, @RequestBody Employee employee) {
        return new Employee();
    }

    @DeleteMapping(path = "/employee/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        log.info("delete the employee with identifier: " + id.toString());
        employeeDao.deleteById(Long.valueOf(id));
    }
}
