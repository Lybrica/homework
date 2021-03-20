package com.company;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        stutterer(input);
    }
    public static void stutterer(String text) {
        String[] list = text.split(" ");
        for(String word : list) {
            System.out.print(word + " " + word + " ");
        }
    }
}
