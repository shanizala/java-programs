// File: VowelOrConsonant.java
// Topic: Basic (Switch Case)
// Author: Z. Shani
// Description: Check whether an alphabet is a vowel or consonant using switch-case

import java.util.Scanner;

class VowelOrConsonant
{
    public static void main(String [] args )
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter an Alphabet ::");
        char n=sc.next().charAt(0);

        switch(n)
        {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            System.out.println("Vowel"); break;

            default:
            System.out.println("Consonant ");
        }
    }
}