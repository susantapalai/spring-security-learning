package com.example.springsecurity.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Spring Boot!";
    }

    @GetMapping("/about")
    public String about(){
        return "Learning Spring Framework";
    }
}
