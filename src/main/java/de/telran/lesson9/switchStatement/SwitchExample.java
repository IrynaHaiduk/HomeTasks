package de.telran.lesson9.switchStatement;

import de.telran.lesson7.calculator.CalculatorDescription.UserInput;

public class SwitchExample {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        int userInt;
        double userDouble;
        String userText;


        System.out.println("Menu: ");
        System.out.println("1. Integer ");
        System.out.println("2. Double ");
        System.out.println("3. Text ");

        System.out.println("Please make a choice: ");
        int userChoise = ui.userInputInt();

        switch (userChoise) {
            case 1:
                System.out.println("Please enter integer number: ");
                userInt = ui.userInputInt();
                break;

            case 2:
                System.out.println("Please enter double number: ");
                userDouble = ui.userInputDouble();
                break;
            case 3:
                System.out.println("Please enter text: ");
                userText = ui.userInputText();
                break;
            default:
                System.out.println("Wrong choice!");
        }

    }
}
