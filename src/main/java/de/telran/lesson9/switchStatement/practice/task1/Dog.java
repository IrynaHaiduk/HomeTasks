package de.telran.lesson9.switchStatement.practice.task1;

public class Dog {
    String name;
    int age;
    String color;
    double weight;

    public Dog(String name, int age, String color, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public void voice() {
        System.out.println("Dogs name is " + name + ". Dogs age is " + age + ". Dogs color is " + color + ". Dogs weight is " + weight + ".");
    }

    public void happyBirthday() {
        this.age++;
    }

    public void changeColor (String newColor) {
        color = newColor;
    }

    public void changeWeight(double changeValue) {
        this.weight = this.weight + changeValue;
    }

}
