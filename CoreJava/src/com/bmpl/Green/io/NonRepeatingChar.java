package com.bmpl.Green.io;

import java.util.Scanner;

public class NonRepeatingChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = scanner.nextLine();
		System.out.println("The given string is:" + str);
		int count;
		char string[] = str.toCharArray();
		System.out.println("First non duplicate character :");
		for(int i=0; i<string.length; i++) {
			count = 1;
			for(int j = i+1; j<string.length; j++) {
			if( string[i] == string[j] && string[i] != '0') {
				count++;
				string[j]='0';		
				
			}
					
				}
			
			if(count ==1 && string[i] != '0')
				System.out.println(string[i]);
			
			scanner.close();
		}
			}
}


