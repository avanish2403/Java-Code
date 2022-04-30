package com.bmpl.Green.io;

public class ArrayPairSum {

	public static void main(String[] args) {
	int arr1[] = {1,4,6,7,8,10};
	int arr2[] = {4,5,0,-4,6,5};
	int sum = 13;
	int c=0;
	outer:
	for(int i=0; i<arr1.length; i++){
		for(int j=0; j<arr2.length; j++)
	
	{
		 c = arr1[i] + arr2[j];
		 if(c==sum) {
				System.out.println("Pair is" + arr1[i] + "and" + arr2[j]);
				
				break outer;
			}

		 }
			 
		 }
	if(c!=sum)
	System.out.println("Pair not found");
	}
		
	}
	

