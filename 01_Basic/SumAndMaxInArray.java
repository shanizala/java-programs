// File: SumAndMaxInArray.java
// Topic: Basic
// Author: Z. Shani
// Description: Takes array input from user, calculates sum and finds max value

import java.util.Scanner;

class SumAndMaxInArray
{
    public static void main(String []args )
    {

        System.out.println("Shani zalavadiya ");

        
        Scanner sc = new Scanner (System.in);

        int size;

        System.out.println("Ente the size of Array ::");
        size=sc.nextInt();


        int [] n= new int [size];

        for(int i=0;i<n.length;i++)
        {
            System.out.println("Enter the element ::");
            n[i]=sc.nextInt();
        }
        for(int i=0;i<n.length;i++)
        {
            System.out.println("Eelement is ::"+n[i]);
        }

        int sum=0;

        for(int i=0;i <n.length;i++)
        {
            sum= sum+n[i];
        }

        int max = n[0];

        for(int i=0; i<n.length; i++)
        {
            if (n[i] > max)
            {
                max = n[i];
            }
        }

        System.out.println("Sum of all elements is ::"+sum);
        System.out.println("Maximum elements is ::"+max);
    }
}