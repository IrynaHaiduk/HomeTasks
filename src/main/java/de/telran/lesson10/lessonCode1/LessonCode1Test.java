package de.telran.lesson10.lessonCode1;

import de.telran.lesson10.lessonCode1.LessonCode1;

public class LessonCode1Test {
    public static void main(String[] args) {
        LessonCode1 lessonCode1 = new LessonCode1();


        int userInput = 4;

        boolean actualResult1 = lessonCode1.isEven(userInput);

        boolean expectedResult1 = true;

        if (actualResult1 == expectedResult1) {
            System.out.println("Test1 is OK!");
        } else {
            System.out.println("Test1 is falsch!");
            System.out.println("Expected result is " + expectedResult1 + ". You received " + actualResult1 + ".");
        }

        userInput = 5;

        boolean actualResult2 = lessonCode1.isEven(userInput);

        boolean expectedResult2 = false;

        if (actualResult2 == expectedResult2) {
            System.out.println("Test1 is OK!");
        } else {
            System.out.println("Test1 is falsch!");
            System.out.println("Expected result is " + expectedResult2 + ". You received " + actualResult2 + ".");
        }

        userInput = -56;

        boolean actualResult3 = lessonCode1.isEven(userInput);

        boolean expectedResult3 = true;

        if (actualResult3 == expectedResult3) {
            System.out.println("Test1 is OK!");
        } else {
            System.out.println("Test1 is falsch!");
            System.out.println("Expected result is " + expectedResult3 + ". You received " + actualResult3 + ".");
        }
    }
}
