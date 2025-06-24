// File: DepartmentYearSwitch.java
// Topic: Basic (Nested Switch Case)
// Author: Z. Shani
// Description: Displays department and year based on input using nested switch-case

import java.util.Scanner;

class DepartmentYearSwitch
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Department code (1: IT ,2: Dr) ::");
        int d=sc.nextInt();

        System.out.println("Enter year (1 or 2) ::");
        int y=sc.nextInt();

        switch(d)
        {
            case 1:
            switch(y)
            {
                case 1:
                System.out.println("IT First yesr "); break;

                case 2:
                System.out.println("IT Second year "); break;

                default:
                System.out.println("Invaliad year :("); break;
            }
            break;

            case 2:
            switch(y)
            {
                case 1:
                System.out.println("Dr First yesr "); break;

                case 2:
                System.out.println("Dr Second year "); break;

                default:
                System.out.println("Invaliad year "); break;
            }
            break;

            default:
            System.out.println("Invaliad Department :(")
        }
    }
}