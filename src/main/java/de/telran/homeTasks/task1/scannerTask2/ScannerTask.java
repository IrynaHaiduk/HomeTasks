package de.telran.homeTasks.task1.scannerTask2;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word with even number letters: ");
        String  word1 = scanner.nextLine();
        String firstHalfOfWord1 = word1.substring(0, word1.length() /2 );

        System.out.print("Enter second word with even number letters:: ");
        String  word2 = scanner.nextLine();
        String secondHalfOfWord2 = word2.substring(word2.length()/2, word2.length());

        String result = firstHalfOfWord1 + secondHalfOfWord2;

        System.out.println(result);
    }
}
