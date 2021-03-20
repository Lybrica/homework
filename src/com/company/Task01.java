package com.company;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float diameter = scanner.nextFloat();
        double pi = 3.14;
        System.out.println(2*Math.PI*(diameter/2));
    }
}
