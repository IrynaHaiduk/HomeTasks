package de.telran.lesson7;

public class PersonDemo {
    public static void main(String[] args) {
        Person personOlga = new Person("Olga", "Berlin");
        Person personIvan = new Person("Ivan", "Koln");

        System.out.println(personOlga.name);
        System.out.println(personOlga.town);
        System.out.println(personIvan.name);
        System.out.println(personIvan.town);
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);



    }
}
