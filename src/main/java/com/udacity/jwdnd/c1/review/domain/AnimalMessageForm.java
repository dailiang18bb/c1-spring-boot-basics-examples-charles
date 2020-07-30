package com.udacity.jwdnd.c1.review.domain;

public class AnimalMessageForm {

    private String animalText;
    private String adjective;

    public AnimalMessageForm(String animalText, String adjective) {
        this.animalText = animalText;
        this.adjective = adjective;
    }

    public String getAnimalText() {
        return animalText;
    }

    public void setAnimalText(String animalText) {
        this.animalText = animalText;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }
}
