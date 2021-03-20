package com.company.task19;

import java.util.Arrays;

public class Main19 {
    public static void main(String[] args) {

        Poem poem0 = new Poem(new Author("Koidula", "EE"));
        Poem poem1 = new Poem(new Author("Liiv", "EE"));
        Poem poem2 = new Poem(new Author("Goethe", "GE"));

        Poem[] poems = new Poem[]{poem0, poem1, poem2};

        for (int i = 0; i < poems.length; i++) {
            for (int j = i + 1; j < poems.length; j++) {
                Poem tmp;
                if (poems[i].getStropheNumbers() > poems[j].getStropheNumbers()) {
                    tmp = poems[i];
                    poems[i] = poems[j];
                    poems[j] = tmp;
                }
            }
        }
        System.out.println(poems[poems.length-1].creator.surname);
    }
}
