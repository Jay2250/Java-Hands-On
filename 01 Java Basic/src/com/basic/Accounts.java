package com.basic;

public class Accounts {
    public static void main(String[] args) {
        Account acc = new Account();
        Account acc2 = new Account(12345,"bbb");
        acc.displayInterestRate();
        acc2.displayInterestRate();
    }
}
