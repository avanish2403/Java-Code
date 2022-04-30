package com.pdmu.Green.io;

import java.util.Scanner;

public class SumOfPrimeInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = sc.nextInt();
		int arr[] = new int[10];
		arr[0]=1;
		arr[1]=1;
		arr[2]=1;
		arr[3]=1;
		arr[4]=0;
		arr[5]=1;
		arr[6]=0;
		arr[7]=1;            
		arr[8]=0;             
		arr[9]=0;
		
		int sum=0;
		while(x>0)       
		{
			int a = x % 10;   
			if(arr[a]==0)     
			{
				sum=sum+a;     
			}
			x=x/10;         
		}
		System.out.println(sum);
		sc.close();
	}

}
