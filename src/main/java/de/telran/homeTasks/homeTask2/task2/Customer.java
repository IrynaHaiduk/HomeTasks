package de.telran.homeTasks.homeTask2.task2;

public class Customer {
    boolean condition1;
    boolean condition2;

    public boolean canBuy(boolean condition1, boolean condition2) {
        boolean canBuy = condition1 || condition2;
        System.out.println("I can buy food, it's " + canBuy + ".");
        return canBuy;
    }
}
