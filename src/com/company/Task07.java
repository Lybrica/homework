package com.company;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <3; i++){

        }

        int n1=0,n2=1,n3=0,i,count=10;

        for(i=0;i<n;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        System.out.println(n3);
    }
}
