package com.bmpl.Green.io;

import java.math.BigInteger;
import java.util.Scanner;

public class solution {
public static void main(String[] args)
{
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the number of iteration : ");
     int t = in.nextInt();
     String input;
     System.out.println("Enter the numbers:");
     for(int a = 0; a < t; a++) 
     {
        // Ask for the number
        input = in.next();
        BigInteger number = new BigInteger(input);
            System.out.println(input + " can be fitted in:");
            if(number.longValue() < Byte.MAX_VALUE && number.longValue() > Byte.MIN_VALUE)
            {
                System.out.println("* byte");
            }

            if(number.longValue() < Short.MAX_VALUE && number.longValue() > Short.MIN_VALUE)
            {
                System.out.println("* short");
            }

            if(number.longValue() < Integer.MAX_VALUE && number.longValue() > Integer.MIN_VALUE)
            {
                System.out.println("* int");
            }
            
            if(number.longValue() < Long.MAX_VALUE && number.longValue() > Long.MIN_VALUE) 
            {
                System.out.println("* long");
            } 
           

     }
     in.close();
    
}

}