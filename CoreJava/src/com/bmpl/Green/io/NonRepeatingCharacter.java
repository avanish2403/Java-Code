package com.bmpl.Green.io;

import java.util.Scanner;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = scanner.nextLine();
		System.out.println("The given string is:" + str);
		for(int i =0; i<str.length(); i++) {
			char c = str.charAt(i);
			System.out.println(c);
			
			boolean unique = true;
			
			for(int j =0; j<str.length(); j++) {	
				
				if(i==j) {
					continue;
				}if(str.charAt(i)==str.charAt(j)) {
				unique = false;
					break;
				}
			}
		if(unique) {
			System.out.println("The first non repeated character in string is:" + str.charAt(i));
			break;
			}
		
	
			
			
		scanner.close();
		
		

	}
	

}
	}
