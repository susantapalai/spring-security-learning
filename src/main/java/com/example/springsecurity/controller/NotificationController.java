package com.example.springsecurity.controller;

import com.example.springsecurity.service.EmailNotificationService;
import com.example.springsecurity.service.NotificationService;
import com.example.springsecurity.service.SmsNotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
//    private final EmailNotificationService emailNotificationService;
//    public NotificationController(EmailNotificationService emailNotificationService){
//        this.emailNotificationService = emailNotificationService;
//    }
//
//    private final SmsNotificationService smsNotificationService;
//    public NotificationController(SmsNotificationService smsNotificationService){
//        this.smsNotificationService = smsNotificationService;
//    }

    private final NotificationService notificationService;
    public NotificationController(
//            @Qualifier("smsNotificationService")
            NotificationService notificationService){
        this.notificationService = notificationService;
    }

    @GetMapping("/notify")
    public String notification(){
        return notificationService.notification();
    }
}
