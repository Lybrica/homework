package com.company;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        // Cast char to int //String.charAt
        int asciiA = (int) a.charAt(0);
        int asciiB = (int) b.charAt(0);

        System.out.println(asciiB-asciiA);
    }
}
