package de.telran.homeTasks.homeTask5;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int arrayLength = 8;
        int minRandomLimit = 1;
        int maxRandomLimit = 10;

        Random random = new Random();
        int[] intArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            intArray[i] = minRandomLimit + random.nextInt(maxRandomLimit - minRandomLimit);
        }

        System.out.println(Arrays.toString(intArray));

        for (int i = 0; i < arrayLength; i++) {
            if (i % 2 != 0) {
                intArray[i] = 0;
            }
        }

        System.out.println(Arrays.toString(intArray));
    }
}
