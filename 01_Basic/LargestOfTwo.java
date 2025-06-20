// File: LargestOfTwo.java
// Topic: Basic
// Author: Z. Shani
// Description: Finds the largest of two numbers

import java.util.Scanner;

public class LargestOfTwo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a > b)
            System.out.println(a + " is larger");
        else
            System.out.println(b + " is larger");
    }
}
