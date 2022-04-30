package com.bmpl.Green.io;

public class arr3D {

	public static void main(String[] args) {
		int arr[][][] = { { { 1,2} , {3,4} , {5,6} , {7,8} } };
		System.out.println("[");
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("[");
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<arr[i][j].length; k++)
				{
					System.out.print(arr[i][j][k] + " " + ",");
				}
				System.out.println();
			}
			System.out.println("]");
			System.out.println();
		}
		System.out.print("]");
		//System.out.println("[");
//		System.out.println();
//		
//		for(int[][] arr3D : arr ) {
//			System.out.println("[");
//			for(int[] arr2D : arr3D) {
//				for( int element : arr2D) {
//					System.out.print(element + " " + ",");
//				}
//				System.out.println();
//				
//			}
//			System.out.println("]");
//			System.out.println();
//		}
//		System.out.print("]");

	}

}