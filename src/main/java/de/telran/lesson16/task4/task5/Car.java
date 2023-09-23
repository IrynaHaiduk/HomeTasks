package de.telran.lesson16.task4.task5;

public class Car {

    private double price;
    private String model;

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public Car(double price, String model) {
        this.price = price;
        this.model = model;
    }

    public void printCatInfo() {
        System.out.println("Car - " + getModel() + ", price = " + getPrice());
    }
}
