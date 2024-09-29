package com.exceptions;

public class MathNew {
    public static void divide(String s1, String s2) throws ArrayIndexOutOfBoundsException, ArithmeticException, NumberFormatException {
        int dividend = Integer.parseInt(args[0]);
        int divisor = Integer.parseInt(args[1]);

        int res = dividend/divisor;
        System.out.println("Result of Division is : " + res);
    }

    public static void main(String[] args) {
        try {
            divide(args[0], args[1]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {          // Multi-catch block
            System.out.println(e);
        }
    }
}
