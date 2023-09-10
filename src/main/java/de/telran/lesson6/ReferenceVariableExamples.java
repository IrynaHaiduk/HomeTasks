package de.telran.lesson6;

public class ReferenceVariableExamples {
    public static void main(String[] args) {
        Cat cat1 = new Cat(2);
        Cat cat2 = cat1;

        System.out.println(cat2.age);

        cat1.age = 3;

        System.out.println(cat2.age);




    }
}
