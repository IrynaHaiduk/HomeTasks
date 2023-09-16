package de.telran.lesson10;

import java.util.Scanner;

public class ShapeAreaCalculatorDemo {

    public static void main(String[] args) {

        System.out.println("Please choice your shape: ");
        System.out.println("1 - Круг");
        System.out.println("2 - Квадрат");
        System.out.println("3 - Прямоугольник");

        Scanner scanner = new Scanner(System.in);
        int shapeType = scanner.nextInt();

        double shapeParam1 = 0;
        double shapeParam2 = 0;
        double calculatedArea = 0;

        switch (shapeType) {

            case 1:
                System.out.println("Пожалуйста введите радиус круга: ");
                shapeParam1 = scanner.nextDouble();
                calculatedArea = 3.14 * shapeParam1 * shapeParam1;
                break;
            case 2:
                System.out.println("Пожалуйста введите сторону квадрата: ");
                shapeParam1 = scanner.nextDouble();
                calculatedArea = shapeParam1 * shapeParam1;
                break;
            case 3:
                System.out.println("Пожалуйста введите первую сторону прямоугольника: ");
                shapeParam1 = scanner.nextDouble();
                System.out.println("Пожалуйста введите вторую сторону прямоугольника: ");
                shapeParam2 = scanner.nextDouble();
                calculatedArea = shapeParam1 * shapeParam2;
                break;
        }

        System.out.println("Enter your answer: ");
        double userAnswer = scanner.nextDouble();
        boolean checkUserAnswer = (userAnswer == calculatedArea);

        if (checkUserAnswer) {
            System.out.println("Answer is correct.");
        } else {
            System.out.println("Answer is incorrect. Correct answer is " + calculatedArea + ".");
        }
    }

}
