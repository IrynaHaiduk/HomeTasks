package de.telran.lesson7.calculator.CalculatorDescription;

import java.util.Scanner;

public class BadPractise {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Inter integer number1: ");

        Scanner scanner = new Scanner(System.in);

        int param1 = scanner.nextInt();

        System.out.println("Inter integer number2: ");

        int param2 = scanner.nextInt();



        double result = calculator.add(param1, param2);

        System.out.println("Result of adding numbers: " + result);

    }
}
