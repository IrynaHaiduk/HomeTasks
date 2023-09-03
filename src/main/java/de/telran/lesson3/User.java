package de.telran.lesson3;

import java.util.Scanner;

public class User {
    public void greeting () {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public void greetingImproved () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "! Your name starts from " + userName.charAt(0) + " and ends on " + userName.charAt(userName.length() - 1));

    }
}
