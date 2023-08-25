package com.example.springboot.controllers;

import com.example.springboot.models.Occupation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RequestOccupation {

    @GetMapping(path="/occupation/getAllObjects")
    public List<Occupation> getAll() {
        return new ArrayList<Occupation>();
    }

    @GetMapping(path="/occupation/getObject/{id}")
    public Occupation getObject(@PathVariable("id") int id) {
        return new Occupation();
    }

    @PostMapping("/occupation/add")
    public void post(Occupation occupation) {

    }

    @PutMapping("/occupation/update")
    public Occupation put(int id, Occupation occupation) {
        return new Occupation();
    }

    @DeleteMapping("/occupation/delete")
    public void delete(int id){}
}
