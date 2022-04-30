package com.pdmu.Green.io;

public class Nth {
	int an, cd;
	public void Nth_term() 
{  
   int z= ( an + (20 - 1) * cd ); 
   System.out.print("The 20th term of the series is : " + z);
}
	Nth(int a, int d){
		an = a;
		cd = d;
	}

	public static void main(String[] args) {
		Nth ob = new Nth(5,5);
		ob.Nth_term();
	}

}
//89047384