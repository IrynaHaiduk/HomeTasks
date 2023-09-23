package de.telran.homeTasks.homeTask5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter few words: ");

        String userString = scanner.nextLine();
        userString = userString.trim();

        System.out.println(userString);
        int spacesCount = 1;

        for (int i = 0; i < userString.length(); i++) {
            if (Character.isWhitespace(userString.charAt(i)) && !Character.isWhitespace(userString.charAt(i+1))) {
                spacesCount++;
            }
        }

        System.out.println("You entered " + spacesCount + " words.");
    }
}
