package de.telran.lesson16.task4.task5;

public class Task5 {
    public static void main(String[] args) {
        Car car1 = new Car(2500, "Fiat");
        Car car2 = new Car(15000, "Ford");
        Car car3 = new Car(250000, "Toyota");
        Car car4 = new Car(50000, "VW");
        Car car5 = new Car(7500, "Mers");


        Car[] cars = {car1, car2, car3, car4, car5};

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car - " + cars[i].getModel() + ", price = " + cars[i].getPrice());
            cars[i].printCatInfo();
        }

    }
}
