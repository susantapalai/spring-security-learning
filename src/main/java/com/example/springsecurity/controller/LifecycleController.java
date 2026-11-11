package com.example.springsecurity.controller;

import com.example.springsecurity.service.LifecycleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LifecycleController {

    private final LifecycleService lifecycleService;

    public LifecycleController(LifecycleService lifecycleService) {
        this.lifecycleService = lifecycleService;
    }

    @GetMapping("/lifecycle")
    public String lifecycle() {
        return lifecycleService.getMessage();
    }
}