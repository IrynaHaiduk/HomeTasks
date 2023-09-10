package de.telran.homeTasks.task1.convertCurrencyTask5;

public class ConvertCurrency {
    double euroPerDollar = 0.95;
    double eurosAmount;

    public void convertEurosPerDollars(double eurosAmount) {
        double dollarsAmount = eurosAmount * euroPerDollar;
        System.out.println("You will get in dollars: ");
        System.out.println(dollarsAmount);
    }
}
