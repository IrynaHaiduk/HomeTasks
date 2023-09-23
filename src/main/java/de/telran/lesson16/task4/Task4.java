package de.telran.lesson16.task4;

public class Task4 {
    public static void main(String[] args) {

        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        Pen pen3 = new Pen();

        Pen[] pens = new Pen[3];

        pens[0] = pen1;
        pens[1] = pen2;
        pens[2] = pen3;

        pens[0].setColor("Green");
        pens[1].setColor("Red");
        pens[2].setColor("Black");

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Second element " + intArray[1]);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i] + ", ");
        }

        for (int i = 0; i < pens.length; i++) {
            System.out.println(pens[i].getColor());

        }

        Pen newPen = pen1;

        newPen.setColor("White");
        System.out.println(newPen.getColor());
    }

}
