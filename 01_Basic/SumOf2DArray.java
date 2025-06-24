// File: SumOf2DArray.java
// Topic: Basic (2D Array)
// Author: Z. Shani
// Description: Takes 2D array input from user and calculates sum of all elements

import java.util.Scanner;

class SumOf2DArray
{
    public static void main(String [] args )
    {

        System.out.println("Shani zalavadiya "); 

        
        Scanner sc= new Scanner(System.in);

        int size,size1;

        System.out.println("Enter the Array coloum ::");
        size=sc.nextInt();

        System.out.println("Enter the Array Row    ::");
        size1=sc.nextInt();

        int [][] n=new int [size][size1];


        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size1;j++)
            {
                System.out.print("Enter  the Element a["+i+"]["+j+"]::");
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

        int sum=0;

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size1;j++)
            {
                sum= sum+n[i][j];
            }
        }

        System.out.println("sum of all Array element is ::"+sum);
    }
}