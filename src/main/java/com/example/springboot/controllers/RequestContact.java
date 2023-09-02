package com.example.springboot.controllers;

import com.example.springboot.models.Contact;
import com.example.springboot.repo.ContactRepo;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import jakarta.websocket.server.PathParam;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RequestContact extends RequestPatter {

    @Autowired
    private ContactRepo contactDao;

    @GetMapping(path = "/contact/getAllObjects")
    public String getAll() {
        log.info(gson.toJson(contactDao.findAll()));
        return gson.toJson(contactDao.findAll());
    }

    @GetMapping(path = "/contact/getObject/{id}")
    public String getObject(@PathVariable("id") Integer id) {
        log.info(gson.toJson(contactDao.findById(Long.valueOf(id)).get()));
        return gson.toJson(contactDao.findById(Long.valueOf(id)).get());
    }

    @PostMapping(path = "/contact/add")
    public void post(@RequestBody Contact contact) {
        log.info(contact.getIdentifier().toString());
        contactDao.save(contact);

    }

    @PutMapping(path = "/contact/update")
    public Contact put(@PathVariable int id, @RequestBody Contact contact) {
        return new Contact();
    }

    @DeleteMapping(path = "/contact/remove/{id}")
    public void deleteContact(@PathVariable("id") Integer id) {
        log.info("Delete the contact with identifier: " + id.toString());
        contactDao.deleteById(Long.valueOf(id));
    }
}
