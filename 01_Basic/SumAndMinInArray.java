// File: SumAndMinInArray.java
// Topic: Basic
// Author: Z. Shani
// Description: Takes array input from user, prints all elements, finds sum and minimum value

import java.util.Scanner;

class SumAndMinInArray
{
    public static void main(String [] args )
    {

        System.out.println("Shani zalavadiya ");

        
        Scanner sc =new Scanner (System.in);


        int size;

        System.out.print("Enter the Array size ::");
        size=sc.nextInt();


        int [] n = new int[size];


        for (int i=0;i<n.length;i++)
        {
            System.out.println("Enter the elent ::");
            n[i]=sc.nextInt();

        }
        System.out.println("Array all element  ");


        for (int i=0;i<n.length;i++)
        {
            System.out.println("Element is ::"+n[i]);
        }

        int sum=0;

        for(int i=0;i<n.length;i++)
        {
            sum= sum+n[i];
        }

        int min = n[0];

        for(int i=0;i<n.length;i++)
        {
            if (min>n[i])
            {
                min=n[i];
            }
        }
        System.out.println("Sum of all element is  ::"+sum );
        System.out.println("minimum element is "+min);
    }
}