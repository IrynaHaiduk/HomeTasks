package de.telran.homeTasks.homeTask5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.println("Enter integer number more than 3: ");
            n = scanner.nextInt();
        } while (n <= 3);

        int[] intArray = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            intArray[i] = random.nextInt(n);
        }

        System.out.println(Arrays.toString(intArray));

        int evenArrayLength = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                evenArrayLength++;
            }
        }

        int[] evenNumArray = new int[evenArrayLength];
        int counterArray = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                evenNumArray[counterArray] = intArray[i];
                counterArray++;
            }
        }

        if (evenNumArray.length > 0) {
            System.out.println(Arrays.toString(evenNumArray));
        }

    }
}
