package de.telran.lesson8.unarOperator;

public class Counter {
    int count;

    public Counter (int count) {
        this.count = count;
    }

    public void increment() {
        count++;
    }

    public int Counter() {
        return count;
    }

    public void decrement() {
        count--;
    }
}
