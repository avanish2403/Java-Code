package com.bmpl.Green.io;

public class arr2D {

	public static void main(String[] args) {
		int arr2D[][] = {{5,6,7} , {8,9}};
//		for(int i=0; i<arr2D.length; i++) {
//		{ for(int j=0; j<arr2D[i].length; j++)
//		{
//			
//			System.out.println("arr" + "[" +i + "][" + j + "]=" + arr2D[i][j]);
//		
//			
//		}
//		}	
//		}
		
		for(int[] arr1D : arr2D) {
			for(int i : arr1D) {
				System.out.println(i);
			}
		}
		
	}
	}

//}
