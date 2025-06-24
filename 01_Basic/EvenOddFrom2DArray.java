// File: EvenOddFrom2DArray.java
// Topic: Basic (2D Array)
// Author: Z. Shani
// Description: Takes 2D array input from user and prints even and odd elements separately

import java.util.Scanner;

class EvenOddFrom2DArray
{
    public static void main(String [] args )
    {
        Scanner sc= new Scanner(System.in);

        int size,size1;

        System.out.print("Enter the Araay coloum ::");
        size=sc.nextInt();

        System.out.print("Enter the Array Row    ::");
        size1=sc.nextInt();

        int [][] n=new int[size][size1];

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size1;j++)
            {
                System.out.print("Enter the Element a["+i+"]["+j+"] is ::");
                n[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size1;j++)
            {
                System.out.println("Element a["+i+"]["+j+"] is ::"+n[i][j]);

            }
        }

        System.out.println("even elements ");

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size1;j++)
            {
                if(n[i][j]%2==0)
                {
                    System.out.println(n[i][j]);
                }
            }
        }

        System.out.println("odd element ");

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size1;j++)
            {
                if(n[i][j]%2==1)
                {
                    System.out.println(n[i][j]);
                }
            }
        }
    }
}