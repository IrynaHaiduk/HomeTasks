package de.telran.lesson14.race;

public class Race {
    private String raceNumber;

    private double distance;

    public double raceResultCalculate(Car ourCar) {
        double raceResult = distance / ourCar.getMaxSpeed();
        return raceResult;
    }

    public Race(String raceNumber, double distance) {
        this.raceNumber = raceNumber;
        this.distance = distance;
    }
}
