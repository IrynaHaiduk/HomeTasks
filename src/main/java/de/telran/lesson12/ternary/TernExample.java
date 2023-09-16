package de.telran.lesson12.ternary;

public class TernExample {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int max = 0;

        if (x > y) {
            max = x;
        } else {
            max = y;
        }

        int maxTern = (x > y) ? x : y;
    }
}
