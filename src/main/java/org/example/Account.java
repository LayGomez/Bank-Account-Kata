package org.example;

public class Account {
    private double balance;


    public Account(double balance) {
        this.balance = balance;
    }

    public Account() {
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }


    public double addAmount(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    public void withDraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException();
        }
        this.balance -= amount;
    }

}
