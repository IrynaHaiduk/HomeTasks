package de.telran.lesson12.loop;

import java.util.Random;

public class LoopFor {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++ ) {
            int calcResult;

            if (i % 2 == 0) {
                calcResult = i * i* random.nextInt(100);
            } else {
                calcResult = i * i*i* random.nextInt(1000);
            }

            System.out.println("i " + i + " random " + calcResult);
        }

        for (int i = 100; i >= 0; i = i -10 ) {
            int calcResult;

            if (i % 2 == 0) {
                calcResult = i * i* random.nextInt(100);
            } else {
                calcResult = i * i*i* random.nextInt(1000);
            }

            System.out.println("i " + i + " random " + calcResult);
        }
    }
}
