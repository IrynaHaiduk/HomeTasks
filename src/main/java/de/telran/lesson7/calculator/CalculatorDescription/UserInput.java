package de.telran.lesson7.calculator.CalculatorDescription;

import java.util.Scanner;

public class UserInput {
    public int userInputInt() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

    public double userInputDouble() {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        return input;

    }

    public  String userInputText() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }
}
