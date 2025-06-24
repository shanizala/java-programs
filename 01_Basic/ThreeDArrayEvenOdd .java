// File: ThreeDArrayEvenOdd.java
// Topic: Basic (3D Array)
// Author: Z. Shani
// Description: Takes 3D array input and prints even and odd elements separately

import java.util.Scanner;

class ThreeDArrayEvenOdd
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        int s1,s2,s3;

        System.out.println("Enter the Array coloum ::");
        s1=sc.nextInt();

        System.out.println("Enter the Array Row1  ::");
        s2=sc.nextInt();

        System.out.println("Enter the Array Row2  ::");
        s3=sc.nextInt();

        int [][][] n=new int[s1][s2][s3];

        for(int i=0;i<s1;i++)
        {
            for(int j=0;j<s2;j++)
            {
                for(int k=0;k<s3;k++)
                {
                    System.out.print("Enter the Element a["+i+"]["+j+"]["+k+"]");
                    n[i][j][k]=sc.nextInt();
                }
            }
        }
        for(int i=0;i<s1;i++)
        {
            for(int j=0;j<s2;j++)
            {
                for(int k=0;k<s3;k++)
                {
                    System.out.println("Element a["+i+"]["+j+"]["+k+"] is ::"+n[i][j][k]);
                }
            }
        }

        System.out.println("all Even Element ");

        for(int i=0;i<s1;i++)
        {
            for(int j=0;j<s2;j++)
            {
                for(int k=0;k<s3;k++)
                {
                    if(n[i][j][k]%2==0)
                    {
                        System.out.println(n[i][j][k]);
                    }
                }
            }
        }

        System.out.println("all Odd elements ");


        for(int i=0;i<s1;i++)
        {
            for(int j=0;j<s2;j++)
            {
                for(int k=0;k<s3;k++)
                {
                    if(n[i][j][k]%2==1)
                    {
                        System.out.println(n[i][j][k]);
                    }
                }
            }
        }
    }
}