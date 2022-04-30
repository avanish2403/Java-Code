package com.pdmu.Green.io;

public class ElectricBill {

	public static void main(String[] args) {
		
		int initial_reading = 200, final_reading = 500;
		int consumed = final_reading - initial_reading;
		
		if(consumed >= 0 && consumed <= 100)
		{
			System.out.println("Your bill is zero" );
		}
		
		else if(consumed >= 100 && consumed <= 200)
		{
			System.out.println("Your bill is " + consumed*1 );
		}
		
		else if(consumed >= 200 && consumed <= 500)
		{
			System.out.println("Your bill is " + consumed*6 );
		}
		else
		{
			System.out.println("Your bill is " + consumed*10);
		}
		

	}

}
