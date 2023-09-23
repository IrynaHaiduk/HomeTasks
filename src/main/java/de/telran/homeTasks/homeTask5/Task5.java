package de.telran.homeTasks.homeTask5;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int arrayLength = 5;
        int minRandomLimit = 0;
        int maxRandomLimit = 5;

        Random random = new Random();
        int[] intArray1 = new int[arrayLength];
        int[] intArray2 = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            intArray1[i] = minRandomLimit + random.nextInt(maxRandomLimit - minRandomLimit);
        }

        for (int i = 0; i < arrayLength; i++) {
            intArray2[i] = minRandomLimit + random.nextInt(maxRandomLimit - minRandomLimit);
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arrayLength; i++) {
            sum1+=intArray1[i];
            sum2+=intArray2[i];
        }

        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(intArray2));

        double averageArray1 = sum1/arrayLength;
        double averageArray2 = sum2/arrayLength;

        System.out.println("Average for Array1 is " + averageArray1);
        System.out.println("Average for Array2 is " + averageArray2);

        if (averageArray1 > averageArray2) {
            System.out.println("Average for Array1 is bigger.");
        } else   if (averageArray1 < averageArray2) {
            System.out.println("Average for Array2 is bigger.");
        } else System.out.println("Average for Array1 is equel to average for Array2.");


    }
}
