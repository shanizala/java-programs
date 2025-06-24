// File: PatternStar.java
// Topic: Basic
// Author: Z. Sunny
// Description: Prints a right-angled triangle star pattern using nested loop

import java.util.Scanner;

class RightTrianglePattern
{
    public static void main(String [] args )
    {
        System.out.println("Shani Zalavadiya");

        int i;
        int j;

        for(i = 0; i <= 10; i++)
        {
            for(j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
