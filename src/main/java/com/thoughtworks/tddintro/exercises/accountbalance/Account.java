package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    public Account(int initBalance) {
        balance = initBalance;
    }

    public int getBalance() {
        return balance;
    }

    public int deposit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int withdraw(int amount) {
        if (amount <= this.balance)
            this.balance -= amount;
        return this.balance;
    }
}
