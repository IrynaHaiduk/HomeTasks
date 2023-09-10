package de.telran.homeTasks.homeTask2.task2;

public class Task2 {
    public static void main(String[] args) {
        boolean isEdekaOpen = false;
        boolean isReweOpen = true;

        Customer customer1 = new Customer();
        customer1.canBuy(isEdekaOpen, isReweOpen);
    }
}
