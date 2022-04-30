package com.pdmu.Green.io;

public class Area1 {
		int length,breadth,side;
		double area;

		void area(double d)
		{
		double area= (22*d*d)/7;
		 System.out.println("Area of circle =" + area);
		}

		void area(int l,int b){
			int a=l*b; 
			System.out.println("Area of rectangle =" + a);
		   }
		
	    void area(int s)
		   {
			   int b=s*s;
			   System.out.println("Area of square =" + b);
		   }

		public static void main(String[] args) {
			Area1 ob = new Area1();
			ob.area(5);
			ob.area(5,10);
			ob.area(10);
			
		}

	}


