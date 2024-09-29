package com.exceptions;

public class Bank {

    public static void deposit(Account acc, double amount) {
        try {
            acc.depositAmount(amount);
        } catch (IncorrectDenominationException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void withdraw(Account acc, double amount) {
        try {
            acc.withdrawAmount(amount);
        } catch (InsufficientFundException | TransactionLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws InsufficientFundException, IncorrectDenominationException, TransactionLimitExceededException {
        Account acc = new Account(101, "Jay", 10000);
        System.out.println(acc);

        deposit(acc, 500);
        deposit(acc, 210);                    // raise the IncorrectDenominationException
        deposit(acc, 200);
        deposit(acc, 310);
        deposit(acc, 500);

        withdraw(acc, 500);
        withdraw(acc, 500);
        withdraw(acc, 15000);                // raise the InsufficientFundException
        withdraw(acc, 500);
        withdraw(acc, 4000);                 // raise the TransactionLimitExceededException
        withdraw(acc, 5000);

    }
}
