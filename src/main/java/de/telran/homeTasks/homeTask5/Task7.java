package de.telran.homeTasks.homeTask5;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int arrayLength = 5;
        int minRandomLimit = 10;
        int maxRandomLimit = 99;

        Random random = new Random();
        int[] intArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            intArray[i] = minRandomLimit + random.nextInt(maxRandomLimit - minRandomLimit);
        }

        System.out.println(Arrays.toString(intArray));

        boolean isArrayIncreasingSequence = true;

        for (int i = 0; i < arrayLength; i++) {
            if (intArray[i] > intArray[i + 1]) {
                isArrayIncreasingSequence = false;
                break;
            } else {
                isArrayIncreasingSequence = true;
            }
        }

        if (isArrayIncreasingSequence) {
            System.out.println("This array is increasing sequence.");
        } else {
            System.out.println("This array isn't increasing sequence.");
        }
    }

}
