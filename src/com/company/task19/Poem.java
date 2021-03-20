package com.company.task19;

public class Poem {
    Author creator;
    int stropheNumbers;

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public Poem(Author creator) {
        this.creator = creator;
        this.stropheNumbers = (int) (Math.random() * 10);
    }
}
