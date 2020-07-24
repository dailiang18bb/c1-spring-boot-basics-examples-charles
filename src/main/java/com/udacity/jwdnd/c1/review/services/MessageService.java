package com.udacity.jwdnd.c1.review.services;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MessageService {

    private String message;

    public MessageService(String message) {
        this.message = message;
        System.out.println("MessageService constructer called!");
    }

    public String getUppercase(){
        System.out.println("getUppercase method called!");

        return this.message.toUpperCase();
    }

    public String getLowercase(){
        System.out.println("getUppercase method called!");
        return this.message.toLowerCase();
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Message Service Post Construct method called!");
    }
}
