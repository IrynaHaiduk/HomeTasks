package de.telran.lesson14.race;

public class RaceApp {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", "SL55 AMG", 360);
        Car car2 = new Car("MBW", "M4", 330);
        Car car3 = new Car("Mustang", "Diablo", 380);

        Race raceMonaco = new Race("Monaco", 75);
        double resultCar1 = raceMonaco.raceResultCalculate(car1);
        double resultCar2 = raceMonaco.raceResultCalculate(car2);
        double resultCar3 = raceMonaco.raceResultCalculate(car3);

        if (resultCar1 < resultCar2 && resultCar1 < resultCar3) {
            System.out.println("Won " + car1.getProducer());
        } else  if (resultCar2 < resultCar1 && resultCar2 < resultCar3) {
            System.out.println("Won " + car2.getProducer());
        } else  if (resultCar3 < resultCar1 && resultCar3 < resultCar2) {
            System.out.println("Won " + car3.getProducer());
        }


    }
}
