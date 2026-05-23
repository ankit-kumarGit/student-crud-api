package com.ankit.studentapi.notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class SmsNotification implements NotificationService{

    @Override
    public String sendNotification(){
        return "SMS Notification Sent";
    }
}
