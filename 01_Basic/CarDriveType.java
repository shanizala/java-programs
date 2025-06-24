// File: CarDriveType.java
// Topic: Basic (Nested Switch Case - Real Life)
// Author: Z. Shani
// Description: Identifies car type based on road type and drive configuration

import java.util.Scanner;

class CarDriveType
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter car choice (1 =off road,2 = on road ) ::");
        int s=sc.nextInt();

        System.out.println("Enter (1 = 2*4 , 2 = 4*4 ) ::");
        int s1=sc.nextInt();

        switch(s)
        {
            case 1:
            switch(s1)
            {
                case 1:
                System.out.println(" thar is 2*4 car "); break;

                case 2:
                System.out.println(" Thar is 4*4 car "); break;

                default:
                System.out.println("Invaliad ");

            }break;
            
            case 2:
            switch(s1)
            {
                case 1:
                System.out.println("scorpio n 2*4 car "); break;

                case 2:
                System.out.println("scorpio n 4*4 car "); break;

                default:
                System.out.println("Invaliad");
            }break;

            default:
            System.out.println("Invaliad ");
        }
    }
}