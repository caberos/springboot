package com.example.springboot.controllers;

import com.example.springboot.models.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RequestContact {
    @GetMapping(path="/contact/getAllObjects")
    public List<Contact> getAll() {
        return new ArrayList<Contact>();
    }

    @GetMapping(path="/contact/getObject/{id}")
    public Contact getObject(@PathVariable("id") int id) {
        return new Contact();
    }

    @PostMapping
    @RequestMapping("/contact/add")
    public void post(Contact contact) {

    }

    @PutMapping
    @RequestMapping("/contact/update")
    public Contact put(int id, Contact contact) {
        return new Contact();
    }

    @DeleteMapping
    @RequestMapping("/contact/delete")
    public void delete(int id){}
}
