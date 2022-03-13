package com.bridgelabz.functions;

import java.util.Scanner;

public class Quadratic
{
    public static double a,b,c,delta,root1,root2;
    public static void QuadraticRoots()
    {
        System.out.println("Enter the values of a,b & c : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        delta =  ((Math.pow(b, 2)) - (4*a*c));
        root1 =  (double)((-b + Math.sqrt(delta))/(2*a));
        root2 =  (double)((-b - Math.sqrt(delta))/(2*a));
        System.out.println(delta);
        System.out.println("Root1 = " +root1 +"\nRoot2 = " +root2);

        if(delta>0)
        {
            System.out.println(" Roots of the Equation ax^2+bx+c : " );
        }
        else
            System.out.println("These are imaginary roots");
        sc.close();
    }
    public static void main(String[] args)
    {
        QuadraticRoots();
    }
}
