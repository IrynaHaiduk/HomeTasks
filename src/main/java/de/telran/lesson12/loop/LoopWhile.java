package de.telran.lesson12.loop;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        boolean condition = true;

        while (condition) {
            System.out.println("PLease enter two numbers. If you enter first number 100, program stops.");
            System.out.println("Enter first number: ");
            x = scanner.nextInt();

            System.out.println("Enter second number: ");
            y = scanner.nextInt();

            System.out.println("Add result: " + (x + y));

            if (x==100) {
                condition = false;
            }
        }


        // example 2

        int z = 0;
        int w = 100;

        while (z <= 100) {
            System.out.println("z" + z);
        }
    }
}
