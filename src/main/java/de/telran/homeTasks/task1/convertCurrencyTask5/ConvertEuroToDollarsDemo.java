package de.telran.homeTasks.task1.convertCurrencyTask5;

import java.util.Scanner;

public class ConvertEuroToDollarsDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your amount in euro: ");
        double eurosAmount = scanner.nextDouble();

        ConvertCurrency convertCurrency = new ConvertCurrency();

        convertCurrency.convertEurosPerDollars(eurosAmount);
    }
}
