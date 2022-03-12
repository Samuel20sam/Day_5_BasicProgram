package com.bridgelabz.basic;

import java.util.Scanner;

public class Vowels
{
    public static void findtype(char c)
    {
        if (c == 'a') {
            System.out.println(c +" is a vowel");
        } else if (c == 'e') {
            System.out.println(c +" is a vowel");
        } else if (c == 'i') {
            System.out.println(c +" is a vowel");
        } else if (c == 'o') {
            System.out.println(c +" is a vowel");
        } else if (c == 'u') {
            System.out.println(c +" is a vowel");
        } else if (c == 'A') {
            System.out.println(c +" is a vowel");
        } else if (c == 'E') {
            System.out.println(c +" is a vowel");
        } else if (c == 'I') {
            System.out.println(c +" is a vowel");
        } else if (c == 'O') {
            System.out.println(c +" is a vowel");
        } else if (c == 'U') {
            System.out.println(c +" is a vowel");
        } else {
            System.out.println(c +" is constant");
        }
    }
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the charter to check");
        char c = s.next().charAt(0);
        findtype(c);
    }
}
