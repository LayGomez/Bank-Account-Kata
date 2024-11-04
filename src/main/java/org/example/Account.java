package org.example;

public class Account {
    private int accountNumber;
    private double balance;


    public Account(int accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    public double addAmount(double amount){
        if (amount > 0){
            balance += amount;
        }
        return balance;
    }
    public double withDraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
        return balance;
    }
}
