package com.bmpl.Green.io;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(23);
		al.add(10);
		al.add(3);
		al.add(2);
		al.add(50);
		al.remove(Integer.valueOf(23));
		System.out.println(al);
	}

}
