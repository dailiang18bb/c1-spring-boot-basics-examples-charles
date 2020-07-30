package com.udacity.jwdnd.c1.review.domain;

public class ChatMessage {

    private String text;

    public ChatMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
