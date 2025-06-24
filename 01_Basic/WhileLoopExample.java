// File: WhileLoopExample.java
// Topic: Basic - While Loop
// Author: Z. Shani
// Description: Print numbers from 1 to 10 using a while loop

import java.util.Scanner;

class WhileLoopExample
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        int i=1;
        while(i<=10)
        {
            System.out.println(i);
            i++;
        }
    }
}