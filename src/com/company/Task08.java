package com.company;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a float:");
        float a = scanner.nextFloat();
        System.out.println("Enter a mathmatical operator:");
        String operator = scanner.nextLine();
        System.out.println("Enter a float:");
        float b = scanner.nextFloat();


        float calculation;

        switch (operator) {
            case "-":
                calculation = a - b;
                break;
            case "+":
                calculation = a + b;
                break;
            case "/":
                calculation = a / b;
                break;
            case "*":
                calculation = a * b;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }

        System.out.println(calculation);
    }

    public static String getOperatorInput(Scanner sc) {
        String message = "Enter a mathmatical operator: ";
        System.out.print(message);

        while (true) {
            String line = sc.nextLine();
            try {
                if (line.equals("+") || line.equals("-") || line.equals("/") || line.equals("*")) return line;
            } catch (NumberFormatException e) {
                // ok to ignore: let it fall through to print error message and try next line
            }
            System.out.print("Error: invalid symbol.\n" + message);
        }
    }
}
