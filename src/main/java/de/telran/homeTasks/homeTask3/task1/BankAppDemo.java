package de.telran.homeTasks.homeTask3.task1;

import java.util.Scanner;

public class BankAppDemo {
    public static void main(String[] args) {
        BankApp bankApp = new BankApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        int userNumber = scanner.nextInt();

        int withdrawalsAmount = bankApp.withdrawMoney(userNumber);
        System.out.println("Number of withdrawals is " + withdrawalsAmount + ".");

    }
}
