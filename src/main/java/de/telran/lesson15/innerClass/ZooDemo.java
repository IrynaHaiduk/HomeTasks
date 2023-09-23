package de.telran.lesson15.innerClass;

public class ZooDemo {
    public static void main(String[] args) {
        Zoo zooBerlin = new Zoo();

        Zoo.Monkey smallMonkey = zooBerlin.new Monkey();
        System.out.println(smallMonkey.getBreed());

        Zoo zooLeipzig = new Zoo();

        Zoo.Monkey bigMonkey = zooLeipzig.new Monkey();
        System.out.println(bigMonkey.getBreed());


    }
}
