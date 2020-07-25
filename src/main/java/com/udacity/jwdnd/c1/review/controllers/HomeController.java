package com.udacity.jwdnd.c1.review.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Instant;

@Controller
public class HomeController {

    @RequestMapping(value = {"/home", "/", ""})
    public String getHomePage(Model model){
        model.addAttribute("welcomeMessage", "Hi there, this message comes from model object");
        model.addAttribute("timestampMessage", Instant.now());

        return "home";
    }
}
