// File: ThreeDArraySumMinMax.java
// Topic: Basic (3D Array)
// Author: Z. Shani
// Description: Takes 3D array input, prints all elements, and finds sum, max, min


import java.util.Scanner;

class ThreeDArraySumMinMax
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        int s1,s2,s3;

        System.out.print("Enter the Array coloum ::");
        s1=sc.nextInt();

        System.out.println("Enter the Array Row1 ::");
        s2=sc.nextInt();

        System.out.println("Enter the Array Row2 ::");
        s3=sc.nextInt();

        int [][][] n=new int[s1][s2][s3];


        for(int i=0;i<s1;i++)
        {
            for(int j=0;j<s2;j++)
            {
                for(int k=0;k<s3;k++)
                {
                    System.out.print("Enter the Element a["+i+"]["+j+"]["+k+"] ::");
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

        int sum=0;

        for(int i=0;i<s1;i++)
        {
            for(int j=0;j<s2;j++)
            {
                for(int k=0;k<s3;k++)
                {
                    sum= sum+n[i][j][k];                }
            }
        }

        int max=n[0][0][0];

        for(int i=0;i<s1;i++)
        {
            for(int j=0;j<s2;j++)
            {
                for(int k=0;k<s3;k++)
                {
                    if(max<n[i][j][k])
                    {
                        max=n[i][j][k];
                    }
                }
            }
        }

        int min=n[0][0][0];

        for(int i=0;i<s1;i++)
        {
            for(int j=0;j<s2;j++)
            {
                for(int k=0;k<s3;k++)
                {
                    if(min>n[i][j][k])
                    {
                        min=n[i][j][k];
                    }
                }
            }
        }

        System.out.println("Sum of all Elements is    ::"+sum);
        System.out.println("Maximmum element value is ::"+max);
        System.out.println("Minimmum element value is ::"+min);
    }
}