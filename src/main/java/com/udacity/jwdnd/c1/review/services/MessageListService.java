package com.udacity.jwdnd.c1.review.services;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageListService {

    private List<String> messages;

    @PostConstruct
    public void postConstruct(){
        this.messages = new ArrayList<>();
    }

    public List<String> addMessages(String msg){
        messages.add(msg);
        return this.messages;
    }

    public List<String> getMessages() {
        return new ArrayList<>(this.messages);
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
