// File: ReverseStarPattern.java
// Topic: Basic
// Author: Z. Shani
// Description: Prints a reverse right-angled triangle star pattern

import java.util.Scanner;

class ReverseStarPattern 
{
      public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Shani zalavadiya ");

        
        int i;
        int j;
        int n;

        System.out.print("Enter the number ::");
        n=scanner.nextInt();

        for(i=n;i>0;i--)
        {
            for(j=i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}