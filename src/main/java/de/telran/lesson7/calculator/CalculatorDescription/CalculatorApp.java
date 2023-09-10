package de.telran.lesson7.calculator.CalculatorDescription;

public class CalculatorApp {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        UserOutput uo = new UserOutput();
        Calculator calc = new Calculator();

        System.out.println("Enter first integer (double) number1: ");
        double firstParam = ui.userInputDouble();

        System.out.println("Enter second integer (double) number2: ");
        double secondParam = ui.userInputDouble();


        uo.printData("Result of adding " + firstParam + " and " + secondParam + " is: ", calc.add(firstParam, secondParam));



        uo.printData("Result of muitiplication " + firstParam + " and " + secondParam + " is: ", calc.mult(firstParam, secondParam));


        uo.printData("Result of dividing " + firstParam + " and " + secondParam + " is: ", calc.div(firstParam, secondParam));


        uo.printData("Result of sub " + firstParam + " and " + secondParam + " is: ", calc.sub(firstParam, secondParam));

    }
}
