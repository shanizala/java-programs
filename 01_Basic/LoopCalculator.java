// File: LoopCalculator.java
// Topic: Basic (Switch + Loop)
// Author: Z. Shani
// Description: A calculator using switch-case and do-while loop for continuous operations

import java.util.Scanner;

class LoopCalculator
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);

        char choice;
        do
        {
            System.out.print("Enter the number ::");
            int a=sc.nextInt();

            System.out.println("Enter thenumber ::");
            int b=sc.nextInt();

            System.out.println("Enter the choice  + , - , * , % , / ::");
            char s=sc.next().charAt(0);


            switch (s)
            {
                case '+':
                System.out.println("Result is ::"+(a+b));

                case '-':
                System.out.println("Result is ::"+(a-b));

                case '*':
                System.out.println("Result is ::"+(a*b));

                case '%':
                System.out.println("Result is ::"+(a%b));

                case '/':
                System.out.println("Result is ::"+(a/b));

                default:
                System.out.println("Invaliad choice :(");

            }
            System.out.println("Do you want to continue (y/n) ::");
            choice=sc.next().charAt(0);

        }
        while (choice=='y'  ||choice=='Y' );
    }
}