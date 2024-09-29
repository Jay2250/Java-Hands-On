package com.exceptions;

public class Account {
    protected int id;
    protected String name;
    protected double balance;
    protected int transCount = 0;

    public Account(int id, String name, double balance) {
        this.id = id;
        this.balance = balance;
        this.name = name;
    }

    public void depositAmount(double amount) throws IncorrectDenominationException {
        if (amount % 100 != 0)
            throw new IncorrectDenominationException("Please Deposit amount in multiple of 100!");
        else {
            this.balance += amount;
            System.out.println("Amount of Rs. " + amount + " is being deposited to your account.");
            System.out.println("Transaction Successful...");
            System.out.println("Available Balance : " + this.balance);
        }
    }

    public void withdrawAmount(double amount) throws TransactionLimitExceededException, InsufficientFundException {
        if (this.balance < amount)
            throw new InsufficientFundException("Insufficient Account Balance!");
        else {
            this.transCount++;
            if (this.transCount > 3)
                throw new TransactionLimitExceededException("Your Transaction Limit is Exceeded!");
            else {
                this.balance -= amount;
                System.out.println("Amount of Rs. " + amount + "is deducted from your Account.");
                System.out.println("Transaction Successful...");
                System.out.println("Available Balance : " + this.balance);
            }
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", transCount=" + transCount +
                '}';
    }
}
