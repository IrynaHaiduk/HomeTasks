package de.telran.homeTasks.homeTask3.task1;

public class BankApp {

    public int withdrawMoney(int moneyAmount) {
        int count = 0;

        for (int i = moneyAmount - 1; i >= 0; i--) {

            if (moneyAmount == 1) {
                count++;
            } else if (moneyAmount % i == 0) {
                count++;
                moneyAmount = moneyAmount - i;
                System.out.println("i " + i);
                System.out.println("Count " + count);
                System.out.println("Sum " + moneyAmount);
                i = moneyAmount;

            }
        }
        return count;

    }
}
