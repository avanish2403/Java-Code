package com.pdmu.Green.io;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 1st number = ");
		int a = obj.nextInt();
		System.out.println("Enter 2nd number = ");
		int b = obj.nextInt();
		System.out.println("Enter 3rd number = ");
		int c = obj.nextInt();
		
		    if(a>b && a>c)  
			System.out.println(a+ " is the largest Number");  
		
			else if (b>a && b>c)  
			System.out.println(b+ " is the largest Number");  
		
			else   
			System.out.println(c + " is the largest number");  


	}

}




