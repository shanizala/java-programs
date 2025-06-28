// File: Student.java
// Topic: OOP - Class and Object
// Author: Z. Shani
// Description: Demonstrates creation of a Student class with basic data and method

import java.util.Scanner;

public class Student 
{
    int roll;
    String name;

    void input() 
    {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        sc.nextLine(); 
      
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }

    void display() 
    {
        System.out.println("Roll No: " + roll);
      
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) 
    {
        Student s = new Student();
        s.input();
        s.display();
    }
}
