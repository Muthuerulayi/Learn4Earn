package com.learn4earn.arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		String strArr[][] = new String[2][3];
		
		System.out.println(strArr.length);
		System.out.println(strArr[0].length);
		
		strArr[0][0] = "Muthu";
		strArr[0][1] = "Raja";
		strArr[0][2] = "Kruthi";
		
		strArr[1][0] = "Chitra";
		strArr[1][1] = "Ila";
		strArr[1][2] = "Vetri";
		
		System.out.println("Third column value in second row is " + strArr[1][2]);
		
		System.out.println("Number of rows in the array is " + strArr.length);
		System.out.println("Number of columns in the array is " + strArr[0].length);
		System.out.println();
		
		for(int row = 0; row < strArr.length; row++) {
			for(int col = 0; col < strArr[0].length; col++) {
				System.out.print(strArr[row][col] + " ");
			}
			System.out.println();
		}

	}

}
