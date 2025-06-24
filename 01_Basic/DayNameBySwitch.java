// File: DayNameBySwitch.java
// Topic: Basic (Switch Case)
// Author: Z. Shani
// Description: Displays day name using switch case from input day number (1-7

import java.util.Scanner;

class DayNameBySwitch
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Day number (1-7) ::");
        int day=sc.nextInt();

        switch(day)
        {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Firday"); break;
            case 6: System.out.println("saturday"); break;
            case 7: System.out.println("sunday"); break;

            default: System.out.println("Invalid day :(");
            
        }
    }
}