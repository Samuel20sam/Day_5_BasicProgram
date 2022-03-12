package com.bridgelabz.basic;

import java.util.Scanner;

public class PowerOf2
{
    public static void findpow(int pow)
    {
        long power = 1;
        int i;
        int two = 2;
        for (i = 1; i <= pow; i++) {
            power = power*two;
        }
        System.out.println("The power of 2 of " +pow +" is: " +power);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the number: ");
        int pow = s.nextInt();
        findpow(pow);
    }

}
