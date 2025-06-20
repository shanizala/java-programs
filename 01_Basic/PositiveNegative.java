// File: PositiveNegative.java
// Topic: Basic
// Author: Z. Shani
// Description: Checks if the number is positive, negative or zero

import java.util.Scanner;

public class PositiveNegative 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0)
        {
            System.out.println("Positive");
        }
        else if (num < 0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
