package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //reads  from the user 10 arbitrarily large numbers (variables of type int) and prints those that occurred at least twice.
        int[] numbers = new int[10];

        for (int j = 0; j < numbers.length - 1; j++) {
            numbers[j] = scanner.nextInt();
        }
        Set<Integer> set = new HashSet(Arrays.asList(numbers));
        for (int number : numbers) {
            if (set.add(number) == false) {
                System.out.println(number);
            }
        }
    }
}
