package com.ankit.studentapi.notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary

public class EmailNotification implements NotificationService{

    @Override
    public String sendNotification(){
        return "Email Notification Sent";
    }

}
