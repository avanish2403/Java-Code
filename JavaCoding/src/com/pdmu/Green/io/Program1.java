package com.pdmu.Green.io;

interface Language {
	  void getName(String name);
	}

	class Program1 implements Language {

	  public void getName(String name) {
	    System.out.println("Programming Language: " + name);
	  }
	}

	class Main {
	  public static void main(String[] args) {
	    Program1 language = new Program1();
	    language.getName("Java");
	  }
	}
