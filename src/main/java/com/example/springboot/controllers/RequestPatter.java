package com.example.springboot.controllers;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class RequestPatter {

    static Logger log = LoggerFactory.getLogger(RequestPatter.class.getName());

    Gson gson = new Gson();
}
