// File: MenuDrivenCalculator.java
// Topic: Basic (Menu-driven using do-while and switch-case)
// Author: Z. Shani
// Description: Menu program for multiplication table or basic calculator

import java.util.Scanner;

class MenuDrivenCalculator
{
    public static void main(String [] args )
    {
        Scanner sc=new Scanner(System.in);
        char choice;
        
        do
        {
            System.out.println("1. table ");
            System.out.println("2. calculation ");
            System.out.println("choice a number ::");
            int s=sc.nextInt();

            switch(s)
            {
                case 1:
                System.out.println("Enter table of number ::");
                int t=sc.nextInt();

                for(int i=1;i<=10;i++)
                {
                    System.out.println(+t+"*"+i+"="+t*i);
                }
                break;

                case 2:
                System.out.println("Enter First number ::");
                int a=sc.nextInt();

                System.out.println("Enter the Second number ::");
                int b=sc.nextInt();

                System.out.println("choice number ");
                System.out.println("+ , - , * , % , /");
                char c=sc.next().charAt(0);

                switch(c)
                {
                    case '+':
                    System.out.println("Result is ::"+(a+b)); break;

                    case '-':
                    System.out.println("Result is ::"+(a-b)); break;

                    case '*':
                    System.out.println("Result is ::"+(a*b)); break;

                    case '%':
                    System.out.println("Result is ::"+(a%b)); break;

                    case '/':
                    System.out.println("Result is ::"+(a/b)); break;

                    default:
                    System.out.println("Invaliad ");

                }break;

                default:
                System.out.println("Invaliad ");

               

            }
            System.out.println("Do you want to continue (y/n) ::");
            choice=sc.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y');
        
        
    }
}