package com.bridgelabz.basic;

import java.util.Scanner;

public class LargestThreeNumbers
{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease Enter the first number you want: ");
        int n1 = input.nextInt();
        System.out.print("\nPlease Enter the second number you want: ");
        int n2 = input.nextInt();
        System.out.print("\nPlease Enter the third number you want: ");
        int n3 = input.nextInt();

        if ( (n1 > n2) && (n1 > n3))
            System.out.println("The greatest number is " +n1);
        else if ( (n2 > n1) && (n2 > n3))
            System.out.println("The greatest number is " +n2);
        else
            System.out.println("The greatest number is " +n3);
    }
}
