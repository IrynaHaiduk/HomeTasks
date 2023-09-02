package de.telran.lesson2;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        int myInt = scanner.nextInt();
        int sum = myInt + 10;
        System.out.println("Sum + 10 " + sum);
        System.out.print("Enter Float number: ");
        double myDouble = scanner.nextDouble();
        System.out.println("Float number - 20:" + myDouble);

        Scanner scannerStr = new Scanner(System.in);
        System.out.print("Enter string ");
        String myStr = scannerStr.nextLine();
        System.out.println(myStr + "!!!!");
    }

}
