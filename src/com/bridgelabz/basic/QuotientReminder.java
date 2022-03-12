package com.bridgelabz.basic;

import java.util.Scanner;

public class QuotientReminder
{
        public static void main(String[] args)
        {

            int dividend, divisor, quotient, reminder;

            Scanner s = new Scanner(System.in);
            System.out.println("\nEnter the dividend:");
            dividend = s.nextInt();
            System.out.println("Enter the divisor:");
            divisor = s.nextInt();
            quotient = dividend / divisor;
            reminder = dividend % divisor;

            System.out.println("The Quotient is " + quotient);
            System.out.println("The reminder is " + reminder);
        }
}