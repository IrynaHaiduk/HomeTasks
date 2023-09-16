package de.telran.lesson10.lessonCode1;

import java.util.Scanner;

public class LessonCode1 {
    public  int getNumber() {
        System.out.println("Enter integer number: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        return  num1;
    }

    public boolean isEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Number is even");
            return true;
        } else {
            System.out.println("Number is odd");
            return  false;
        }
    }



}
