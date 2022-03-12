package com.bridgelabz.basic;

import java.util.Scanner;

public class Swap
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the first number");
        int firstNumber = s.nextInt();
        System.out.println("\nEnter the second number");
        int secondNumber = s.nextInt();
        
        int temp;
        System.out.println("\nThe actual of firstNumber =" +firstNumber);
        System.out.println("The actual of secondNumber =" +secondNumber);

        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("\nAfter swapping of two numbers");
        System.out.println("The present value of firstNumber =" +firstNumber);
        System.out.println("The present value of secondNumber =" +secondNumber);
    }
}
