package com.bridgelabz.basic;

import java.util.Scanner;

public class LeapYear
{
    public static void checkleapyear(int year)
    {
        if (year % 4 == 0) {
            System.out.println(" Its leap year ");
        } else if (year % 100 == 0) {
            System.out.println(" Its not a leap year ");
        } else if (year % 400 == 0) {
            System.out.println("Its leap year ");
        } else {
            System.out.println("Its not a leap year");
        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the year in four digits");

        int year = s.nextInt();
        checkleapyear(year);
    }
}
