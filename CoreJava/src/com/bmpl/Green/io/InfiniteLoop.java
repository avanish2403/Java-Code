package com.bmpl.Green.io;

import java.util.Scanner;
public class InfiniteLoop {

	public static void main(String[] args) {
	while(true) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = scanner.nextLine();
		for(int i=0; i<input.length(); i++) {
			Boolean flag = Character.isDigit(input.charAt(i));
			if(flag)
		
			{
				System.out.println("Integer found");
				
			}
			else {
				System.out.println("String found");
			}
		}
		scanner.close();
	}

	}
	}


