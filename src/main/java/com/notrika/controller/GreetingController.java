package com.notrika.controller;


import com.notrika.entities.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {


    @MessageMapping("/hello/{driverId}")
    @SendTo("/chat/{driverId}/greetings")
    public Greeting greeting(@DestinationVariable String driverId,Greeting message)  {
        return message;
    }
}
