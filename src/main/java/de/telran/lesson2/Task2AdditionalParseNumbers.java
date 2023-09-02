package de.telran.lesson2;

public class Task2AdditionalParseNumbers {
    public static void main(String[] args) {
        int myNum = 345;

        int units = myNum%10;
        int tens = myNum/10 % 10;
        int hundreds = myNum/100;

        System.out.println("Number " + myNum + " -> " + hundreds + ", " + tens + ", " + units + ".");

    }
}
