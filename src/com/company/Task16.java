package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++){
            arr[i] = scanner.nextInt();
        }

        int j = 0;
        for (int i = 0; i < 9; i++){
            if (arr[i] + 1 == arr[i+1]){
                j++;
            }else j=0;
        }
        j++;
        System.out.println(j);
    }
}
