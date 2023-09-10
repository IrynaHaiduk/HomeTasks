package de.telran.homeTasks.homeTask2.task5;

public class CalcCaloriesDemo {
    public static void main(String[] args) {
        CalcCalories calcCalories = new CalcCalories();
       double caloriesDifference =  calcCalories.calcExtraCalories(24, 28);
        System.out.println("Calories difference is " + caloriesDifference + ".");
    }
}
