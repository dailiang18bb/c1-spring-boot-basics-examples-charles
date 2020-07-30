package com.udacity.jwdnd.c1.review.controllers;

import com.udacity.jwdnd.c1.review.domain.ChatForm;
import com.udacity.jwdnd.c1.review.domain.ChatMessage;
import com.udacity.jwdnd.c1.review.services.ChatMessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChatController {

    private final ChatMessageService chatMessageService;

    public ChatController(ChatMessageService chatMessageService) {
        this.chatMessageService = chatMessageService;
    }

    @GetMapping(value = "/chat")
    public String getChatPage(@ModelAttribute("newChatMessage")ChatForm chatForm, Model model){
        model.addAttribute("chatList", this.chatMessageService.getChatMessageList());
        return "chat";
    }

    @PostMapping(value = "/chat")
    public String postChatMessage(@ModelAttribute("newChatMessage")ChatForm chatForm, Model model){
        this.chatMessageService.addChatMessage(new ChatMessage(this.chatMessageService.generateMessage(chatForm)));
        model.addAttribute("chatList", this.chatMessageService.getChatMessageList());
        chatForm.setMessageText("");
        chatForm.setMessageType("");
        chatForm.setUsername("");
        return "chat";
    }
}
