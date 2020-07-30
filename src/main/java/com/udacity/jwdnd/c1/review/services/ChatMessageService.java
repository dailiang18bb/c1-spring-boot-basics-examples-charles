package com.udacity.jwdnd.c1.review.services;

import com.udacity.jwdnd.c1.review.domain.ChatForm;
import com.udacity.jwdnd.c1.review.domain.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Service
public class ChatMessageService {

    private List<ChatMessage> chatMessageList;


    @PostConstruct
    public void postConstruct(){
        this.chatMessageList = new ArrayList<>();
    }

    public List<ChatMessage> addChatMessage(ChatMessage chatMessage){
        this.chatMessageList.add(chatMessage);
        return this.chatMessageList;
    }

    public List<ChatMessage> getChatMessageList(){
//        return new ArrayList<>(this.chatMessageList);
        return this.chatMessageList;
    }

    public String generateMessage(ChatForm chatForm){
        String text = chatForm.getUsername() + ": " + chatForm.getMessageText();
        switch (chatForm.getMessageType()){
            case "Say":
                break;
            case "Shout":
                text = text.toUpperCase();
                break;
            case "Whisper":
                text = text.toLowerCase();
                break;
        }
        return text;
    }
}
