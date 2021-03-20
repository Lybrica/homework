package com.company;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Main.getPositiveIntInput(scanner);

        for (int i = 1; i < num; i++) {
            if (isPrime(i))
                System.out.println(i + " is a Prime Number");
        }
    }

    private static boolean isPrime(int num) {
        for(int i = 2; i<= num /2; i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}

