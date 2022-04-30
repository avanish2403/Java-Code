package com.bmpl.Green.io;

import java.util.Scanner;

public class SeperateCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of iteration:");
		int a = scanner.nextInt();
		scanner.nextLine();
		for(int i = 0; i<a; i++) {
			String str = scanner.nextLine();
			int even = 0;
			int odd = 0;
			int range = str.length()/2;
			char strE[] = new char[range+1];
			char strO[] = new char[range];
			for(int j=0; j<str.length(); j++) {
				if(j%2 == 0) {
					strE[even] = str.charAt(j);
					even++;
				}
				else if(j%2 == 1){
					strO[odd] = str.charAt(j);
					odd++;
					
				}
			}
			System.out.println(strE);
			System.out.println(strO);
			
		}
		scanner.close();

}
}