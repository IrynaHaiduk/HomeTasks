package de.telran.lesson9.switchStatement.practice.task1;

import de.telran.lesson9.switchStatement.practice.task1.Dog;

public class DogExample {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", 6, "White", 7);
        dog1.voice();
        dog1.happyBirthday();
        dog1.changeColor("Black");
        dog1.voice();
        dog1.changeColor("Tiger");
        dog1.changeWeight(-1.5);
        dog1.voice();
    }
}
