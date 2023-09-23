package de.telran.lesson16;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int arraySize = 15;
        int[] intArray = new int[arraySize];
        Random random = new Random();
        int countEven = 0;

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(10);
            System.out.println(intArray[i]);
            if (intArray[i] % 2 == 0) {
                countEven++;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(intArray));
        System.out.println("Number of even numbers is " + countEven + ".");

        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 != 0) {
               intArray[i] = 0;
            }
        }

        System.out.println(Arrays.toString(intArray));
    }
}
