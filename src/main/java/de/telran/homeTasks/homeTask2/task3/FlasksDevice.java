package de.telran.homeTasks.homeTask2.task3;

public class FlasksDevice {
    double temperature1;
    double temperature2;

    public void checkDevice(double temperature1, double temperature2) {

        if (temperature1 > 100 && temperature2 < 100) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
