package com.company;

import java.time.LocalDate;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;


public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date(yyyy-mm-dd): ");
        String date = scanner.nextLine();

        LocalDate endDate = LocalDate.parse(date);
        LocalDate startDate = LocalDate.now();

        System.out.println(DAYS.between(startDate, endDate));
    }
}
