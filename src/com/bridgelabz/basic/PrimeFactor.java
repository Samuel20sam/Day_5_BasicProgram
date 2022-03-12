package com.bridgelabz.basic;

import java.util.Scanner;

public class PrimeFactor
{
    public static void main(String[] args)
    {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number to be factored");
        number = sc.nextInt();

        for(int i = 2; i < number; i++)
        {
            while(number%i == 0)
            {
                System.out.println(i);
                number = number/i;
            }
        }
        if(number >2)
        {
            System.out.println(number);
        }
    }
}
