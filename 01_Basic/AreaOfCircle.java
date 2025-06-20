// File: AreaOfCircle.java
// Topic: Basic
// Author: Z. Shani
// Description: Calculates area of a circle using formula A = π*r²

import java.util.Scanner;

public class AreaOfCircle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        double area = Math.PI * r * r;
        System.out.println("Area = " + area);

        sc.close();
    }
}
