package com.enums;

import java.util.Scanner;

public class NewDate {
    private int day;
    Month month;
    private int year;

    public NewDate(int day, Month m,int year)
    {
        this.day=day;
        this.year=year;
        this.month=m;
    }
    public void displayDate()
    {
        System.out.println("The Date is : "+this.day+"/"+this.month+"/"+this.year);
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return this.day;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day : ");
        int day1 = sc.nextInt();
//        Month month = Month.JAN;
        Month [] lists= Month.values();
        for(Month m : lists)
        {
            System.out.println(m);
        }
        System.out.println("Select the month : ");
        String choice = sc.next();
        Month m1 = Month.valueOf(choice.toUpperCase());
        System.out.println("Enter the year : ");
        int y1 = sc.nextInt();



        NewDate d1= new NewDate(day1,m1,y1);
        d1.displayDate();
    }
}
