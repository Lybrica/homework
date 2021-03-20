package com.company;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // input = asd asd asd // 11 - 9 = 2
        int spaces = input.length() - input.replaceAll(" ", "").length();
        System.out.println(spaces);
    }
}
