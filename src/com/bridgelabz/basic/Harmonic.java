package com.bridgelabz.basic;

import java.util.Scanner;

public class Harmonic
{
    static double nthHarmonic(int N)
    {

        double harmonic = 1;


        for (int i = 2; i <= N; i++) {
            harmonic += (double)1 / i; //casting
        }

        return harmonic;
    }
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease Enter the Harmonic value you want: ");
        int N = input.nextInt();

        System.out.print(nthHarmonic(N));

    }
}