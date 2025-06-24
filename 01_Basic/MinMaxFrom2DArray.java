// File: MinMaxFrom2DArray.java
// Topic: Basic (2D Array)
// Author: Z. Shani
// Description: Takes 2D array input and finds maximum and minimum elements

import java.util.Scanner;

class MinMaxFrom2DArray
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        int size,size1;

        System.out.print("Enter the Array coloum ::");
        size=sc.nextInt();

        System.out.print("Enter the Array Row    ::");
        size1=sc.nextInt();

        int [][] n=new int[size][size1];

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size1;j++)
            {
                System.out.print("Enter the Element a["+i+"]["+j+"]");
                n[i][j]=sc.nextInt();

            }
        }

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size1;j++)
            {
                System.out.println("Element a["+i+"]["+j+"]"+n[i][j]);
            }
        }

        int max = n[0][0];

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size1;j++)
            {
                if(max>n[i][j])
                {
                    max = n[i][j];
                }
            }
        }
        
        int min=n[0][0];

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size1;j++)
            {
                if(min<n[i][j])
                {
                    min=n[i][j];
                }
            }
        }

        System.out.println("Array maximmum Element value is ::"+max);
        System.out.println("Array minimmum Element value is ::"+min);
    }
}