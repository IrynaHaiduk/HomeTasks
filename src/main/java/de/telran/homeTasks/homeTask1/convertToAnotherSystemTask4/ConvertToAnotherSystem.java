package de.telran.homeTasks.homeTask1.convertToAnotherSystemTask4;

public class ConvertToAnotherSystem {
    public static void main(String[] args) {
        String num1 = "333"; // from 16-system to 10-system
        int num2 = 819; //from 10-system to 16-system
        int num3 = 101101; //from 2-system to 10-system
        int num4 = 124; //from 10-system to 2-system

        int convertedNum1 = Integer.parseInt(Long.toString(Long.parseLong(num1, 16), 10));
        System.out.println(convertedNum1);

        int convertedNum2 = Integer.parseInt(Long.toString(Long.parseLong(String.valueOf(num2), 10), 16));
        System.out.println(convertedNum2);

        int convertedNum3 = Integer.parseInt(Long.toString(Long.parseLong(String.valueOf(num3), 2), 10));
        System.out.println(convertedNum3);

        int convertedNum4 = Integer.parseInt(Long.toString(Long.parseLong(String.valueOf(num4), 10), 2));
        System.out.println(convertedNum4);

    }
}
