package de.telran.lesson14.phone;

public class PhoneDemo {

    public static void main(String[] args) {



        Phone phone1 = new Phone("Apple", "iPhone 15", "red", 1800.67);
        Phone phone2 = new Phone("Samsung", "Samsung 15", "red", 2300.67);
        Phone phone3 = new Phone("Huawei", "Huawei15", "red", 400.67);
        Phone phone4 = new Phone("Nokia", "Nokia 15", "red", 200.67);
        Phone phone5 = new Phone("Sony", "Sony 15", "red", 180.67);

        System.out.println();

        phone2.setPrice(2340);
        System.out.println(phone2.getPrice());

    }




}
