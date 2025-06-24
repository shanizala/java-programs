// File: ATMMenu.java
// Topic: Basic (Switch Case with ATM simulation)
// Author: Z. shani
// Description: ATM Menu using switch-case – Check balance, deposit, withdraw

import java.util.Scanner;

class ATMMenu
{
    public static void main(String [] args )
    {

        Scanner sc=new Scanner (System.in);

        int balance=1000;

        System.out.println("ATM menu ");
        System.out.println("1. check balance ");
        System.out.println("2. Deposit ");
        System.out.println("3. Withdraw ");
        System.out.println("Enter your choice ::");
        int choice=sc.nextInt();

        switch(choice)
        {
            case 1:
            System.out.println("Balance RS."+balance); break;

            case 2:
            System.out.println("Enter the amouunt Deposit ::");
            int deposit=sc.nextInt();

            System.out.println("New balance is Rs."+deposit+balance); break;

            case 3:
            System.out.println("Enter amount to withdraw ::");
            int w=sc.nextInt();

            if(w<=balance)
            {
                System.out.println("please collect case ");

            }
            else
            {
                System.out.println("Remaining Balance: Rs."+balance);
            }
            break;

            default:
            System.out.println("Invaliad choice ");

        }
        
    }
}