package com.bmpl.Green.io;

import java.util.Scanner;

public class LongestStringFound {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = scanner.nextLine();
		String in = input.toLowerCase();
		System.out.println("The string is : " + in.replace(" ", ""));
		int n = in.length();
		for(int i=0; i<input.length(); i++)
	
		scanner.close();
	}

}
