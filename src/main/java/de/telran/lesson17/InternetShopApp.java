package de.telran.lesson17;

import java.util.Arrays;

public class InternetShopApp {
    public static void main(String[] args) {
        Phone phone1 = new Phone("iPhone15", 1800);
        Phone phone2 = new Phone("iPhone11", 1700);
        Phone phone3 = new Phone("iPhone14", 1900);
        Phone phone4 = new Phone("iPhone16", 1500);
        Phone phone5 = new Phone("iPhone17", 1300);

        Phone[] phones = {phone1, phone2, phone3, phone4, phone5};
        System.out.println(Arrays.toString(phones));

        for (int i = 0; i < phones.length; i++) {
            System.out.println((phones[i]));

        }

        if (phone1 == phone2) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are different");
        }

        String str1 = "Java";
        String str2 = "Java";

        System.out.println(str1.equals(str2));

        System.out.println(phone1.equals(phone2));


    }
}
