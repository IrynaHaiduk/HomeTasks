package de.telran.homeTasks.task1.calculatorTask3;

public class Calculator {
    private static double add(double x, double y) {
        return x + y;
    }
    private static double sub(double x, double y) {
        return x - y;
    }
    private static double mult(double x, double y) {
        return x * y;
    }
    private static double div(double x, double y) {
        if (y == 0) {
            return 0;
        }
        return x / y;
    }
}
