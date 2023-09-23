package de.telran.homeTasks.homeTask5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int arrayLength = 12;
        int minRandomLimit = -15;
        int maxRandomLimit = 15;

        Random random = new Random();
        int[] intArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            intArray[i] = minRandomLimit + random.nextInt(maxRandomLimit - minRandomLimit);
        }

        System.out.println(Arrays.toString(intArray));

        int maxNum = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (intArray[i] >= maxNum) {
                maxNum = intArray[i];
            }
        }

        System.out.println("Max number in Array is " + maxNum + ".");

        int lastIndexOfMaxNum = 0;

        for (int i = arrayLength - 1; i >= 0; i--) {
            if (intArray[i] == maxNum) {
                lastIndexOfMaxNum = i;
                break;
            }
        }

        System.out.println("Last index of max number is " + lastIndexOfMaxNum + ".");
    }

}
