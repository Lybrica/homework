package com.company;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        double result = 1;
        double temp;
        for (int i = 2; i <= n; i++){
            result = result + 1.0/i;
        }
        System.out.println(result);
    }
}
