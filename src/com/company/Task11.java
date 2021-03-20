package com.company;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = new String[99];

        for (int i = 0; !input.equals("Enough!"); i++) {
            while (!input.equals("Enough!")) {
                array[i] = input;
            }
        }
        for (String i : array) System.out.println(i);
    }
}
