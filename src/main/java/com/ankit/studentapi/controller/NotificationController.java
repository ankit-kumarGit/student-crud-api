package com.ankit.studentapi.controller;

import com.ankit.studentapi.notification.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    // inject
    private final NotificationService notService;

    public NotificationController(@Qualifier("smsNotification") NotificationService notService)
    {
        this.notService= notService;
    }

    @GetMapping("/notify")
    public String sendNotification()
    {
        return notService.sendNotification();
    }




}
