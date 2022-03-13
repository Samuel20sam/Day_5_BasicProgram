package com.bridgelabz.functions;

import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D
{
    public static void array()
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        System.out.println("Enter the Rows and Columns");
        int rows = sc.nextInt();
        int colm = sc.nextInt();

        int[][] array = new int[rows][colm];
        System.out.println("Enter array elements: ");

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < colm; j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < colm; j++)
            {
                writer.print(array[i][j] + " ");
            }
            writer.println();
        }
        writer.close();
    }
    public static void main(String[] args)
    {
        array();
    }
}