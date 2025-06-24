// File: SimpleCalculator.java
// Topic: Basic (Switch Case with Arithmetic)
// Author: Z. Shani
// Description: Simple calculator using switch-case for +, -, *, /, %

import java.util.Scanner;

class SimpleCalculator1
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number ::");
        double a=sc.nextDouble();

        System.out.print("Enter the number ::");
        double b=sc.nextDouble();

        System.out.print("Enter the choice +,-,*,%,/ ::");
        char n=sc.next().charAt(0);

        switch(n)
        {
            case '+':
            System.out.println("Result ::"+(a+b)); break;
            case '-':
            System.out.println("Result ::"+(a-b)); break;
            case '*':
            System.out.println("Result ::"+(a*b)); break;
            case '%':
            System.out.println("Result ::"+(a%b)); break;
            case '/':
            System.out.println("Result ::"+(a/b)); break;

        }
    }
}