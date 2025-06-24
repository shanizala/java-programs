// File: UserInput2DArray.java
// Topic: Basic (2D Array)
// Author: Z. Shani
// Description: Takes 2D array size and elements from user and prints the array

import java.util.Scanner;

class UserInput2DArray
{
    public static void main(String [] args)
    {

        System.out.println("Shani zalavadiya "); 

        
        Scanner sc=new Scanner(System.in);

        int size,size1;


        System.out.print("Enter the  size of array coloum ::");
        size=sc.nextInt();

        System.out.print("Enter the size of Array Row     ::");
        size1=sc.nextInt();

        int [][] n=new int[size][size1];


        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size1;j++)
            {
                System.out.println("Enter the Element a["+i+"]["+j+"]::");
                n[i][j]=sc.nextInt();
            }

        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size1;j++)
            {
                System.out.println("Element a["+i+"]["+j+"] ::"+n[i][j]);
            }
        }
    }
}