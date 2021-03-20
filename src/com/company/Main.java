package com.company;

import java.util.Scanner;

public class Main {










    public static int getPositiveIntInput(Scanner sc) {
        String message = "Enter a number: ";
        System.out.print(message);

        while (true) {
            String line = sc.nextLine();
            try {
                int n = Integer.parseInt(line);
                if (n > 0) {
                    return n;
                }
            } catch (NumberFormatException e) {
                // ok to ignore: let it fall through to print error message and try next line
            }
            System.out.print("Error: input must be a positive integer.\n" + message);
        }
    }


}
