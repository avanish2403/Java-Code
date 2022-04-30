package com.bmpl.Green.io;

public class ArrayToInteger {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4};
		int a = 0;
		for(int i=0; i<arr.length; i++) {
			a = 10*a + arr[i];

		}
		System.out.println(a);
		System.out.println("After adding 1 to the previous integer we get:");
		System.out.println(a+1);
		

	}

}