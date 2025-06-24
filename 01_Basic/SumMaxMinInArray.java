// File: SumMaxMinInArray.java
// Topic: Basic
// Author: Z. Shani
// Description: Takes array input from user, prints all elements, calculates sum, max and min

import java.util.Scanner;

class SumMaxMinInArray
{
    public static void main(String [] args )
    {

        System.out.println("Shani zalavadiya ");

        
        Scanner sc= new Scanner (System.in);


        int size;

        System.out.println("Enter the size of Array ::");
        size=sc.nextInt();


        int [] n= new int[size];

        System.out.println("Enter the Array elements ");

        for(int i=0;i<n.length;i++)
        {
            System.out.println("Enter the elenemt ::");
            n[i]=sc.nextInt();
        }

        System.out.println("Array element is ");

        for(int i=0;i<n.length;i++ )
        {
            System.out.println("Element is ::"+n[i]);
        }

        int sum=0;

        for(int i=0;i<n.length;i++)
        {
            sum= sum+n[i];
        }

        int max = n[0];

        for(int i=0; i<n.length;i++)
        {
            if (max<n[i])
            {
                max=n[i];
            }
        }

        int min = n[0];
        for(int i=0;i<n.length;i++)
        {
            if(min>n[i])
            {
                min=n[i];
            }
        }

        System.out.println("Sum of all element is ::"+sum);
        System.out.println("Minimum element is    ::"+min);
        System.out.println("Maximum element is    ::"+max);
    }
}