package com.pdmu.Green.io;

import java.util.Scanner;

public class StringLastWordLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		int i = str.length()-1;
		int count =0;
		while(i>=0 && str.charAt(i)==' ')   
		{
			i--;
		}
		
		while(i>=0 && str.charAt(i)!=' ')
		{
			count++;
			i--;
		}
		System.out.println(count);
		sc.close();

	}

}
