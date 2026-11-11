package com.example.springsecurity.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class LifecycleService {

    public LifecycleService() {
        System.out.println("1. Constructor executed");
    }

    @PostConstruct
    public void init() {
        System.out.println("2. PostConstruct executed");
    }

    public String getMessage() {
        return "Lifecycle service is working!";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("3. PreDestroy executed");
    }

}