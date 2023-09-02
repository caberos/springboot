package com.example.springboot.controllers;

import com.example.springboot.models.Occupation;
import com.example.springboot.repo.OccupationRepo;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class RequestOccupation extends RequestPatter {

    @Autowired
    private OccupationRepo occupationRepo;

    @GetMapping(path = "/occupation/getAllObjects")
    public String getAll() {
        log.info(gson.toJson(occupationRepo.findAll()));
        return gson.toJson(occupationRepo.findAll());
    }

    @GetMapping(path = "/occupation/getObject/{id}")
    public String getObject(@PathVariable("id") Integer id) {
        log.info(gson.toJson(occupationRepo.findById(Long.valueOf(id)).get()));
        return gson.toJson(occupationRepo.findById(Long.valueOf(id)).get());
    }

    @PostMapping(path = "/occupation/add")
    public void post(@RequestBody Occupation occupation) {
        log.info(occupation.getTitle());
        occupationRepo.save(occupation);
    }

    @PutMapping(path = "/occupation/edit/{id}")
    public Occupation put(@PathVariable("id") Integer id, @RequestBody Occupation occupation) {
        Occupation occu = occupationRepo.getReferenceById(Long.valueOf(id));
        
        return new Occupation();
    }

    @DeleteMapping(path = "/occupation/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        log.info("Delete the occupation with identifier: " + id.toString());
        occupationRepo.deleteById(Long.valueOf(id));
    }
}
