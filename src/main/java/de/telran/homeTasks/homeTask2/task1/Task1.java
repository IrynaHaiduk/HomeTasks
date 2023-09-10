package de.telran.homeTasks.homeTask2.task1;

public class Task1 {

    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = false;

        boolean canWalk = isWeekend && !isRain;
        System.out.println(canWalk);
    }

}
