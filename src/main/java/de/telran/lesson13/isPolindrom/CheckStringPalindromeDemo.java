package de.telran.lesson13.isPolindrom;

import java.util.Scanner;

public class CheckStringPalindromeDemo {
    public static void main(String[] args) {
        CheckStringPalindrome checkPalindrome = new CheckStringPalindrome();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String userText = scanner.nextLine();

        boolean checkTextResult = checkPalindrome.isPalindrome(userText);

        if (checkTextResult) {
            System.out.println("Your text is palindrome.");
        } else {
            System.out.println("Your text isn't palindrome.");
        }
    }
}
