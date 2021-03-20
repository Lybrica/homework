package com.company;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = Main.getPositiveIntInput(scanner);

        for (int i = 1; i <= input; i++){
            System.out.println();
            if (i % 3 == 0) {
                System.out.print("Fizz ");
                if (i % 7 == 0) System.out.print("Buzz");
            }
            else if (i % 7 == 0) System.out.print("Buzz");
            else System.out.print(i);
        }
    }
}
