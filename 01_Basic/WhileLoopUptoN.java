// File: WhileLoopUptoN.java
// Topic: Basic - While Loop with Input
// Author: Z. Shani
// Description: Print numbers from 0 to user-given number using while loop

import java.util.Scanner;

class WhileLoopUptoN
{
    public static void main(String [] args )
    {
        Scanner sc=new Scanner(System.in);

        int i=0;
        int n;

        System.out.print("Enter number ::");
        n=sc.nextInt();

        while(i<=n)
        {
            System.out.println(i);

            i++;
        }
    }
}