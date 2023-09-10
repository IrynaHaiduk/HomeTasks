package de.telran.lesson9.switchStatement.practice.modificators;

public class AccountApp {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Luiza", "8698696", "Hey", 68568);

        System.out.println(myAccount.getHolderName());

        myAccount.setBalance(2100067.4);
        System.out.println(myAccount.getBalance());
    }


}
