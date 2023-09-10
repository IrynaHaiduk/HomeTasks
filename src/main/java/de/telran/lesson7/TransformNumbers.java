package de.telran.lesson7;

import java.util.Scanner;

public class TransformNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first system of calculating: ");
        int inNumbers = scanner.nextInt();

        System.out.println("Enter a number: ");
        String inStr = scanner.next();
        long inStrNumber = Long.parseLong(inStr, inNumbers);

        System.out.println("Enter in which system needed transformation: ");
        int outNumbers = scanner.nextInt();
        System.out.println("Transformed number: " + Long.toString(inStrNumber, outNumbers));


        long n16 = Long.parseLong("333", 16);
        System.out.println(Long.toString(n16, 10));
    }
}
