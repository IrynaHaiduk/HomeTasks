package de.telran.lesson10.testing;

import java.util.Scanner;

public class CheckPositiveOrNegativeDemo {
    public static void main(String[] args) {
        CheckPositiveORNegative check = new CheckPositiveORNegative();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");

        int number = scanner.nextInt();

        boolean checkResult = check.isPositive(number);
         if (checkResult) {
             System.out.println("Number is positive");
         } else {
             System.out.println("Number is negative");
         }
    }
}
