package com.bmpl.Green.io;

import java.util.Scanner;

public class NonRepeatingChar1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = scanner.nextLine();
		System.out.println("The given string is:" + str);
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			System.out.println(str.indexOf(c));
			System.out.println(str.lastIndexOf(c));
	
			if(str.lastIndexOf(c) == str.indexOf(c)) {
				System.out.println("First non repeating character :" + c);
				break;
			}
		
		scanner.close();
		}
		
	}
}


