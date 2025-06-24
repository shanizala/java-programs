// File: EvenOddFromArray.java
// Topic: Basic
// Author: Z. Shani
// Description: Takes array input from user, prints even and odd elements separately

import java.util.Scanner;

class EvenOddFromArray
{
    public static void main(String [] args)
    {

        System.out.println("Shani zalavadiya "); 

        
        Scanner sc= new Scanner (System.in);


        int size;

        System.out.println("Enter the size of Array ::");
        size=sc.nextInt();


        int [] n=new int[size];

        System.out.println("Enter the Array Elements ");

        for(int i=0;i<n.length;i++)
        {
            System.out.println("Enter element ::");
            n[i]=sc.nextInt();

        }

        System.out.println("all array elements ");


        for(int i=0;i<n.length;i++)
        {
            System.out.println("Element is ::"+n[i]);
        }

        System.out.println("Elements of  even number ");

        for(int i=0;i<n.length;i++)
        {
            if(n[i]%2==0)
            {
                System.out.println(n[i]);
            }
        }


        System.out.println("Elements of odd number ");

        for(int i=0;i<n.length;i++)
        {
            if(n[i]%2==1)
            {
                System.out.println(n[i]);
            }
        }
    }
}