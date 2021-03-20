package com.company;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float weight = scanner.nextFloat();
        int height = scanner.nextInt();
        double heightD = height;
        double bmi = weight/Math.pow((heightD/100), 2);
        if (isOptimal(bmi)){
            System.out.println("BMI is optimal");
        }else{
            System.out.println("BMI is not optimal");
        }
    }

    public static boolean isOptimal(double bmi) {
        if (bmi >= 18.5 && bmi <= 24.9)
            return true;
        else
            return false;
    }
}
