package com.udacity.jwdnd.c1.review.config;

import com.udacity.jwdnd.c1.review.services.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public String message(){
        System.out.println("message bean created!");
        return "Hello, Spring!";
    }


    @Bean
    public String uppercaseMessage(MessageService messageService) {
        System.out.println("uppercaseMessage bean created!");
        String msg = messageService.getUppercase();
        System.out.println(msg);
        return msg;
    }

    @Bean
    public String lowercaseMessage(MessageService messageService){
        System.out.println("lowercaseMessage bean created!");
        String msg = messageService.getLowercase();
        System.out.println(msg);
        return msg;
    }

}
