package de.telran.lesson2;

public class ParseNumbers {
    public static void main(String[] args) {
        int myNum = 345;
        System.out.println(myNum%10);
        System.out.println(myNum/10 % 10);
        System.out.println(myNum/100);
        System.out.println("Number " + myNum + " -> " + myNum/100 + ", " + myNum/10%10 + ", " + myNum%10 + ".");

    }
}
