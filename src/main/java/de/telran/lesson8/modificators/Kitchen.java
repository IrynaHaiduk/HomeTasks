package de.telran.lesson8.modificators;

import de.telran.lesson8.modificators.service.Multivarka;

public class Kitchen {
    public static void main(String[] args) {
        Multivarka multivarka = new Multivarka("Rewe");
        multivarka.dry();
        System.out.println(multivarka.timeToTheEndCooking());

        int timeToTheEnd = multivarka.timeToTheEndCooking();
        System.out.println("Time to the end of cooking: " + timeToTheEnd);
    }
}
