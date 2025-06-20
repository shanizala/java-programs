// File: SumOfTwoNumbers.java
// Topic: Basic
// Author: Z. Shani
// Description: Takes two integers from user and prints their sum

import java.util.Scanner;

public class SumOfTwoNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}
