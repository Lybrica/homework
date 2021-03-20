package com.company;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = Main.getPositiveIntInput(scanner);
        for (int i = 0; i < count; i++) System.out.print("*      *");
        System.out.println();
        for (int i = 0; i < count; i++) System.out.print(" *    * ");
        System.out.println();
        for (int i = 0; i < count; i++) System.out.print("  *  *  ");
        System.out.println();
        for (int i = 0; i < count; i++) System.out.print("   **   ");
    }
}
