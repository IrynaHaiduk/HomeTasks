package de.telran.lesson15.innerType2;

public class Person {
    public Person(String name) {
        this.name = name;
    }

    private String name;

    public void setAccount (String password) {
        class Account {
            void printData() {
                System.out.println("Account login: " + name + " Password + " + password);
            }
        }

        Account account = new Account();
        account.printData();
    }




}
