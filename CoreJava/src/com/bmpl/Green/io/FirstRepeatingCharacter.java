package com.bmpl.Green.io;

import java.util.Scanner;

public class FirstRepeatingCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = scanner.nextLine();
		System.out.println("The given string is:" + str);
		char c = 0;
		for(int i=0; i<str.length(); i++) {
			 c = str.charAt(i);
			 if(str.indexOf(c) != str.lastIndexOf(c)) {
					System.out.println("First repeating character :" + c);
					break;
				}
			
				
			scanner.close();
			
			
			}
			if(str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.println("_");
			}

	}

}
