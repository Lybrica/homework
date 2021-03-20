package com.company;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a float:");
        float a = Float.parseFloat(scanner.nextLine());
        System.out.println("\nEnter a mathmatical operator:");
        String operator = scanner.nextLine();
        System.out.println("\nEnter a float:");
        float b = scanner.nextFloat();
        if (!isOp(operator)) {
            System.out.println("Invalid symbol");
        } else if (isOp(operator)) {
            System.out.println(calculation(a, operator, b));
        } else
            System.out.println("Cannot calculate");
    }

    public static float calculation(float a, String input, float b) {
        float sum = 0;
        if (isOp(input))
            switch(input) {
                case "+":
                    sum = a + b;
                    break;
                case "-":
                    sum = a - b;
                    break;
                case "*":
                    sum = a * b;
                    break;
                case "/":
                    sum = a / b;
                    break;
            }
        return sum;
    }
    public static boolean isOp(String input) {
        return (input.equals("+")) || (input.equals("-")) || (input.equals("*")) || (input.equals("/"));
    }
}
