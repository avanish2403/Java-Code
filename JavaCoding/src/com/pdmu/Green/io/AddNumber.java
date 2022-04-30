package com.pdmu.Green.io;
import java.util.Scanner;
public class AddNumber {
	public static void main(String[] args) {
		int n,z;
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the number of customer : ");
	     n = sc.nextInt();
	     int arr[] = new int[n];
	     System.out.println("Enter the customer id : ");
	     for(int i =0; i<n; i++)
	     {
	    	 arr[i]=sc.nextInt();
	     }
	     for(int i=0; i<n; i++ )
	     {
	    	 int temp=arr[i],sum=0;
	         while(temp!=0)
	         {	  
	    		z=temp%10;
	    		sum=sum+z;
	    		temp=temp/10;	    		
	    	 }
	         System.out.print(sum+" ");
	     }
	     sc.close();
	     }
}

