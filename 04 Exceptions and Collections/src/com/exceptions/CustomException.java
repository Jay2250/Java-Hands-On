package com.exceptions;

import java.util.Scanner;

public class CustomException {

    public static void checkNumber(int number) throws BigNumberException {
        if (number>60000)
            throw new BigNumberException("Number is too big...");
        else
            System.out.println("Number is in the range");
    }

    public static void main(String[] args) throws BigNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        try {
            checkNumber(number);
            System.out.println("Inside try...");
        } catch (BigNumberException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        checkNumber(number);
        System.out.println("Hell yeah!!!");
    }
}
