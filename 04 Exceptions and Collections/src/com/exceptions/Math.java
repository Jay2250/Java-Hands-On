package com.exceptions;

public class Math {
    public static void main(String[] args) {
        try {
            int dividend = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);

            int res = dividend/divisor;
            System.out.println("Result of Division is : " + res);
        } catch (ArithmeticException e) {
            System.out.println("Dividing by Zero is not possible...");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Enter Integers only...");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter 2 values as the Dividend and Divisor...");
            System.out.println(e.getMessage());
        }

        System.out.println("After the exception handled...");
    }
}
