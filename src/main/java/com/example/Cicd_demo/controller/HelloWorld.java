package com.example.Cicd_demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/demo")
    public String helloWorld(){
        return "Hello World This is a sample project ";
    }
}
