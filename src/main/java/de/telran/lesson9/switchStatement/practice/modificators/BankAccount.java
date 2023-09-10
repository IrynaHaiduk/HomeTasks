package de.telran.lesson9.switchStatement.practice.modificators;

public class BankAccount {

    private String holderName;
    private double balance;
    private String accountNumber;
    private String holderSurname;

    public BankAccount(String holderName,  String accountNumber, String holderSurname, double balance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holderSurname = holderSurname;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    

    public String getHolderSurname() {
        return holderSurname;
    }

    public void setHolderSurname(String holderSurname) {
        this.holderSurname = holderSurname;
    }
}
