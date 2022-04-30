package com.bmpl.Green.io;

import java.util.Scanner;

public class NonRepeatingCh {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = scanner.nextLine();
		System.out.println("The given string is:" + str);
		char c = 0;
		for(int i=0; i<str.length(); i++) {
			 c = str.charAt(i);
//			System.out.println(str.indexOf(c));
//			System.out.println(str.lastIndexOf(c));
	
			if(str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.println("First non repeating character :" + c);
				break;
			}
		
			
		scanner.close();
		
		
		}
		if(str.indexOf(c) != str.lastIndexOf(c)) {
			System.out.println("_");
			
		}
	
		
	}
}



