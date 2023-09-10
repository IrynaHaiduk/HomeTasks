package de.telran.lesson8.modificators.service;

import java.util.Random;

public class Multivarka {

    String model;

    public Multivarka (String model) {
        this.model = model;
    }

    public void dry () {
        System.out.println("Cooking");
    }

    public int timeToTheEndCooking() {
        Random random = new Random();
        int time = random.nextInt(60);
        return time;
    }
}
