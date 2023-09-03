package de.telran;

import de.telran.lesson3.Calc;
import de.telran.lesson3.Student;
import de.telran.lesson3.User;

public class Main {
    public static void main(String[] args) {
        String str1 = new String("I study Basic Java!");

        Student student1 = new Student();

        student1.losung(str1);

        System.out.println(str1.charAt( str1.length()-2));
        System.out.println(str1.contains("Java"));
        System.out.println(str1.substring(0, str1.length() -1 ));
        System.out.println(str1.replace("a", "o"));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        Calc calc = new Calc();
        double par1 = 67.5;
        double par2 = 86.2;

        double sum1 = calc.add(par1, par2);
        double sub1 = calc.sub(par1, par2);
        double mult1 = calc.mult(par1, par2);
        double div1 = calc.div(par1, par2);

        System.out.println("Sum is: " + sum1);
        System.out.println("Sub is: " + sub1);
        System.out.println("Mult is: " + mult1);
        System.out.println("Div is: " + div1);

        User user1 = new User();
        user1.greeting();
        user1.greetingImproved();
    }
}