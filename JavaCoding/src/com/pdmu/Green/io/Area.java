package com.pdmu.Green.io;

public class Area {
	int length,breadth;
	   public void area(){
	      int a=length*breadth; 
	      System.out.println("Area of rectangle is:" + a);
	   }
	   Area(int l,int b){
	      length=l;
	      breadth=b; 
	   }

	public static void main(String[] args) {
		Area ob=new Area(10,12);
	    ob.area();
		
	}

}
