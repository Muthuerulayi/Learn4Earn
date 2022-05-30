package com.learn4earn.arrays;

public class OneDimensionalArray {

	public static void main(String[] args) {

		// Integer Array
		int intArr[] = {0, 1, 2, 3, 4, 5};
		System.out.println("Size of the integer array intArr is " + intArr.length);
		System.out.println("intArr[3] that means the fourth element of the integer array intArr is " + intArr[3]);
		System.out.println();
		
		// Character Array
		char charArr[] = new char[4];
		charArr[0] = '$';
		charArr[1] = 'M';
		charArr[2] = ' ';
		charArr[3] = '7';
		
		System.out.println(charArr);
		System.out.println();
		
		for(int i = 0; i < charArr.length; i++) {
			System.out.println(charArr[i]);
		}

	}

}
