package de.telran.homeTasks.homeTask2.task5;

public class CalcCalories {

    double diametr1;
    double diametr2;

    public  double calcExtraCalories (double diametr1, double diametr2) {
        double radius1 = diametr1/2;
        double radius2 = diametr2/2;
        double caloriesPerCentimetr = 40;

        double square1 = Math.PI * Math.pow(radius1, 2);
        double square2 = Math.PI * Math.pow(radius2, 2);

        double caloriesCount1 = square1 * caloriesPerCentimetr;
        double caloriesCount2 = square2 * caloriesPerCentimetr;
        double caloriesDifference = square2 - square1;
        return caloriesDifference;




    }
}
