package com.pdmu.Green.io;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
	int count = 0,sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string:");
	String str = sc.nextLine();
	for(int i=0; i<str.length(); i++)
	{
		if("AEIOUaeiou".indexOf(str.charAt(i))==-1)
		{
			count++;
			sum=sum+count;
			//break;
		}
		//sum=sum+count;
		//break;
		//System.out.println(count);
	}
	System.out.println(sum);

	}
	

}



// O q P p u t L E --> 2