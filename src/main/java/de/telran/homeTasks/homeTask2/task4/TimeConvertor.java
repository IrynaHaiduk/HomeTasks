package de.telran.homeTasks.homeTask2.task4;

public class TimeConvertor {


    public void showLeftTime(int secondsLeft) {

        int secondsInHour = 60 * 60;
        int hoursLeft = secondsLeft/secondsInHour;

       if (secondsLeft == 0) {
            System.out.println("The working day is over.");
        } else if (hoursLeft < 1) {
            System.out.println("Less than an hour left until the end of the working day.");
        } else{
           System.out.println(secondsLeft + " seconds left until the end of the working day.");
           System.out.println(hoursLeft + " hours left until the end of the working day.");
        }

    }
}
