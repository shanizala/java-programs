// File: NumberTrianglePattern.java
// Topic: Basic
// Author: Z. Shani
// Description: Prints number triangle pattern where each row contains repeated row number

import java.util.Scanner;

class NumberTrianglePattern 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int i, j, n;

        System.out.print("Enter the number :: ");
        n = scanner.nextInt();

        for (i = 1; i <= n; i++) 
        {
            for (j = 1; j <= i; j++) 
            {
                System.out.print(i);
            }
            System.out.println();
        }

        scanner.close();
    }
}
