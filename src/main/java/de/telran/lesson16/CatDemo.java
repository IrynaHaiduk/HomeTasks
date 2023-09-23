package de.telran.lesson16;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Gracy", "brit");
        System.out.println(cat1.getName());
        cat1.setName("Gracy Love");
        System.out.println(cat1.getName());

        CatChanges catChanges = new CatChanges();

        catChanges.changeCatName(cat1, "Gracy");
        System.out.println(cat1.getName());
    }
}
