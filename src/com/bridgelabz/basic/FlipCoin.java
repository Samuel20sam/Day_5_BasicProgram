package com.bridgelabz.basic;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin
{
    public static void main(String[] args)
    {
        Toss t = new Toss();
        double heads = 0;
        double tails = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease Enter The Number Of Coin Tosses You Want: ");
        double chances = input.nextInt();

        for (double i = 1; i<= chances; i++)
        {
            if (t.chanceFunc().equals("tails"))
            {
                tails++;
            }
            else
            {
                heads++;
            }
        }
        System.out.println("Total number of Flips are " + chances);
        System.out.println("Heads wins " + heads +" flips");
        System.out.println("Tails wins " + tails +" flips");

        double headsWinPercentage = ((heads/chances)*100d);
        double tailsWinPercentage = ((tails/chances)*100d);
        System.out.println("Heads Wining Percentage is: " +headsWinPercentage);
        System.out.println("Tails Wining Percentage is: " +tailsWinPercentage);
    }
}
class Toss {
    public String chanceFunc() {
        Random r = new Random();
        double chance = r.nextInt(2);
        if (chance == 1)
        {
            return"tails";
        }
        else
        {
            return"heads";
        }
    }
}