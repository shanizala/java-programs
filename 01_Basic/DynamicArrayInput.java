// File: DynamicArrayInput.java
// Topic: Basic
// Author: Z. Shani
// Description: Takes array size and elements from user and prints them

import java.util.Scanner;

class DynamicArrayInput
{
    public static void main(String [] args)
    {

        System.out.println("Shani zalavadiya ");

        
        Scanner scanner = new Scanner(System.in);

        int i;
        int size;


        System.out.print("Enter the Array size ::");
        size=scanner.nextInt();

        int [] n=new int[size];

        for(i=0;i<n.length;i++)
        {
            System.out.println("Enter the array element ::");
            n[i]=scanner.nextInt();

        }
        for(i=0;i<n.length;i++)
        {
            System.out.println("elenemt is ::"+n[i]);
        }
    }
}