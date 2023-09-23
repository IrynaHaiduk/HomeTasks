package de.telran.lesson17;

public class Auto {
    private int mileage;
    private String color;
    private String name;

    public void run() {
        System.out.println( color + " auto name " + name + " run with mileage " + mileage  );
    }

    public Auto(int mileage, String color, String name) {
        this.mileage = mileage;
        this.color = color;
        this.name = name;
    }
}
