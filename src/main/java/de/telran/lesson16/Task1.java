package de.telran.lesson16;

public class Task1 {
    public static void main(String[] args) {
        int[] intArray = new int[50];
        int counterArray = 0;

        for (int i =1; i < 100; i++) {
            if (i % 2 != 0) {
                intArray[counterArray] = i;
                counterArray++;
            }
        }

        for (int i = 49; i >=0 ; i--) {
            System.out.println(intArray[i] + ",");
        }
    }
}
