package com.udacity.jwdnd.c1.review.controllers;


import com.udacity.jwdnd.c1.review.domain.MessageForm;
import com.udacity.jwdnd.c1.review.services.MessageListService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.Instant;

@Controller
public class HomeController {

    private final MessageListService messageListService;

    public HomeController(MessageListService messageListService) {
        this.messageListService = messageListService;
    }


    @GetMapping(value = {"/home", "/", ""})
    public String getHomePage(@ModelAttribute("newMessage") MessageForm newMessage, Model model){
        model.addAttribute("welcomeMessage", "Hi there, this message comes from model object");
        model.addAttribute("timestampMessage", Instant.now());
//        model.addAttribute("messageList", Arrays.asList("This", "is", "a", "List", "of", "String"));
        model.addAttribute("messageList", messageListService.getMessages());
        return "home";
    }

    @PostMapping(value = "/home")
    public String addFormMessage(@ModelAttribute("newMessage") MessageForm messageForm, Model model){
        messageListService.addMessages(messageForm.getText());
        model.addAttribute("messageList", messageListService.getMessages());
        messageForm.setText("");
        return "home";
    }


//    @RequestMapping(value = "/simplehome")
//    public String getFirstVisitMessage(Model model){
//        boolean firstVisit = true;
//        model.addAttribute("firstVisit", firstVisit);
//        return "home";
//    }
//
//    @PostMapping(value = "/simplehome")
//    public String formSubmit(@ModelAttribute boolean firstVisit){
//        firstVisit = false;
//        return "home";
//    }

}
