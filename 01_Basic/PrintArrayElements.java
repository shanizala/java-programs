// File: PrintArrayElements.java
// Topic: Basic
// Author: Z. Shani
// Description: Prints elements of an integer array using a for loop
import java.util.Scanner;

class PrintArrayElements
{
    public static void main(String [] args)
    {

        System.out.println("Shani zalavadiya ");

        
        Scanner sanner = new Scanner (System.in);

        int [] number ={10,11,12,13,14,15,16};

        System.out.println("Array element ");

        for(int i=0;i<number.length;i++)
        {
            System.out.println(number[i]);
        }
    }
}