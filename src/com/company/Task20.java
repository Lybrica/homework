package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String another = "";
        int answer, guess,attemptsNum = 0;
        final int maxAttempts = 5;

        Random generator = new Random();
        answer = generator.nextInt(100)+1;

        guess = scanner.nextInt();
        while (guess != answer && attemptsNum < maxAttempts-1 && guess != 0 ) {
            if(guess==answer)
                System.out.println("Correct!");
            else if (guess<answer) {
                System.out.println("Your guess was too low.");
                attemptsNum++;
                guess = scanner.nextInt();
            }
            else {
                System.out.println("Your guess was too high.");
                attemptsNum++;
                guess = scanner.nextInt();
            }
        }

        System.out.println ("The number was " + answer);
    }
}
