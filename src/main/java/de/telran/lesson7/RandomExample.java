package de.telran.lesson7;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
       double random1 =  Math.random();
        System.out.println(random1);
        System.out.println((int)(random1 * 100 + 1));

        double random2 = (int) (Math.random()* (50 -10 +1) + 10);
        System.out.println(random2);

        Random randomWithClass = new Random();

        int random3 = randomWithClass.nextInt();
        System.out.println(random3);

        int min = 5;
        int max = 100;

        // min + randomWithClass.nextInt(max - min)

        int random4 = min + randomWithClass.nextInt(max - min);

        System.out.println(random4);

    }

    // get random number from min to max
    // min + Math.random() * (max - min ) + 1

}
