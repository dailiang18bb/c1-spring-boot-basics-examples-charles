package com.udacity.jwdnd.c1.review.domain;


public class MessageForm {

    private String text;

    public MessageForm(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
