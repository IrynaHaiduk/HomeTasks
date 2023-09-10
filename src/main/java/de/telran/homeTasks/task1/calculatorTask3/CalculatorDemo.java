package de.telran.homeTasks.task1.calculatorTask3;

import de.telran.lesson3.Calc;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calc calc = new Calc();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number ");
        double par1 = scanner.nextDouble();
        System.out.print("Enter second number ");
        double par2 = scanner.nextDouble();

        double sum1 = calc.add(par1, par2);
        double sub1 = calc.sub(par1, par2);
        double mult1 = calc.mult(par1, par2);
        double div1 = calc.div(par1, par2);

        System.out.println("Sum is: " + sum1);
        System.out.println("Sub is: " + sub1);
        System.out.println("Mult is: " + mult1);
        System.out.println("Div is: " + div1);
    }
}
