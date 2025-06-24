// File: ThreeDArrayInput.java
// Topic: Basic (3D Array)
// Author: Z. Shani
// Description: Takes 3D array input from user and prints all elements

import java.util.Scanner;

class P22
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        int n1,n2,n3;

        System.out.println("Enter the Array coloum ::");
        n1=sc.nextInt();

        System.out.println("Enter the Array Row1 ::");
        n2=sc.nextInt();

        System.out.println("Enter the Array Row2 ::");
        n3=sc.nextInt();


        int [][][] n=new int[n1][n2][n3];

        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                for(int k=0;k<n3;k++)
                {
                    System.out.print("Enter the element a["+i+"]["+j+"]["+k+"] ::");
                    n[i][j][k]=sc.nextInt();
                }
            }
        }

        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                for(int k=0;k<n3;k++)
                {
                    System.out.println("Element a["+i+"]["+j+"]["+k+"] is ::"+n[i][j][k]);
                }
            }
        }

        
    }
}