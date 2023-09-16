package de.telran.lesson10.testing;

public class CheckPositiveORNegativeTest {
    public static void main(String[] args) {
        CheckPositiveORNegative checkClass = new CheckPositiveORNegative();
        int userInput1 = 4;
        boolean actualResult1 = checkClass.isPositive(userInput1);
        boolean expectedResult1 = true;

        if (actualResult1 == expectedResult1) {
            System.out.println("Test1 is OK!");
        } else {
            System.out.println("Test1 is falsch!");
            System.out.println("Expected result is " + expectedResult1 + ". You received " + actualResult1 + ".");
        }


        userInput1 = -4;
        boolean actualResult2 = checkClass.isPositive(userInput1);
        boolean expectedResult2 = false;


        if (actualResult2 == expectedResult2) {
            System.out.println("Test2 is OK!");
        } else {
            System.out.println("Test2 is falsch!");
            System.out.println("Expected result is " + expectedResult2 + ". You received " + actualResult2 + ".");
        }


    }
}
