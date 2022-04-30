package com.bmpl.Green.io;

import java.util.Scanner;

public class rotation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		System.out.println("How many elements do you want to enter...");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter all elements:-");
		for(i=0; i<n; i++)
		{
			arr[i] = scanner.nextInt();
			
		}
		System.out.println("How much rotation you want:");
		int a = scanner.nextInt(); 
		System.out.println("original array is:");
		for(i=0; i<arr.length; i++)
		{
			System.out.println(arr[i] + "");
			
			
		}
		for(i=0; i<a; i++)
		{
			int j, z;
			z = arr[arr.length-1];
			for(j= arr.length-1; j>0; j--)
				{arr[j] = arr[j-1];
				}
			arr[0] = z;
			
		}
		System.out.println();
		System.out.println("Array after rotation:");
		for(i=0; i<arr.length; i++)
			{System.out.println(arr[i] + "");
			
			}
		
		
		scanner.close();

	}

}
