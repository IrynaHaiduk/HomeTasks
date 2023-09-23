package de.telran.homeTasks.homeTask5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] seasons = new String[]{"Winter", "Spring", "Summer", "Autumn"};

        for (int i = 0; i < seasons.length / 2; i++) {
            String tempString = seasons[i];
            seasons[i] = seasons[seasons.length - i - 1];
            seasons[seasons.length - i - 1] = tempString;
        }

        System.out.println(Arrays.toString(seasons));
    }
}
