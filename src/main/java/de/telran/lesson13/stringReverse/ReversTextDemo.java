package de.telran.lesson13.stringReverse;

import java.util.Scanner;

public class ReversTextDemo {

    public static void main(String[] args) {
        ReverseText reverseText = new ReverseText();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");

        String userString = scanner.nextLine();

       String reversedString = reverseText.returnReverseString(userString);

        System.out.println("Reversed string is " + reversedString + ".");
    }

}
