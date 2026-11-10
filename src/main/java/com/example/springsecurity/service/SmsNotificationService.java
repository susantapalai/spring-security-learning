package com.example.springsecurity.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class SmsNotificationService implements NotificationService{

    @Override
    public String notification() {
        return "SMS notification sent successfully!";
    }
}
