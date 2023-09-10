package de.telran.homeTasks.homeTask2.task4;

public class TimeConvertorDemo {

    public static void main(String[] args) {

        TimeConvertor timeConvertor1 = new TimeConvertor();

        int min = 0;
        int max = 28800;
        int secondsLeft = (int) (min + Math.random() * (max - min +1));

        timeConvertor1.showLeftTime(secondsLeft);

    }
}
