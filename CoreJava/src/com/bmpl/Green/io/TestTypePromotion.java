package com.bmpl.Green.io;

public class TestTypePromotion {
	
	static void testTypePromotion(int x) {
		System.out.println("int");
	}

	static void testTypePromotion(Integer x) {
		System.out.println("Integer");
	}
	
	static void testTypePromotion(int ...x) {
		System.out.println("...");
	}
	static void testTypePromotion(long x) {
		System.out.println("long");
	}
	static void testTypePromotion(double x) {
		System.out.println("double");
	}
	static void testTypePromotion(short x) {
		System.out.println("short");
	}
	

	public static void main(String[] args) {

		testTypePromotion(100);

	}

}
