package com.pdmu.Green.io;

public class Circle {
	float area, circumference;
	Circle(float r)
	{
	 area= (22*r*r)/7;
     circumference = (2*22*r)/7;
	}

	public static void main(String[] args) {
		Circle ob = new Circle(5);
		System.out.println("Area of circle: " + ob.area);
		System.out.println("Circumference of circle: " + ob.circumference);
		

	}

}
