package com.bmpl.Green.io;

import java.util.ArrayList;

public class OverloadingDemo {

	
		static void add() {
			System.out.println(0);
		}
		
		static void add(int a) {
			System.out.println(a);
		}
		
		static void add(double a) {
			System.out.println(a);
		}
		
		static int add(int a, int b) {
			return a+b;
		}
		
		static int add(int a, int b, int c) {
			return a+b+c;
		}
		
//		static int add(ArrayList<Integer> numbers) {
//			return 0;
//		}
		
//		static int add(int[] numbers) {
//			return 0;
//		}
		
		
//		static int add(int ...numbers) {   // varargs -> multiple(variable) args (internally this is an array)
//			int sum = 0;
//			for(int num: numbers) {
//				sum += num;
//			}
//			return sum;
//		}
		
		public static void main(String[] args) {
			add(10);
			add(10.1);
			add(10,20);
			add(10,20,30);
//			add(10,20,30,40);
			//add(new ArrayList<Integer>());
//			add(new int[5]);
			"Ram".toLowerCase();
			String s = "Ram".toLowerCase();

	}

}
