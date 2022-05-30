package com.learn4earn.javaprogramming;

public class ReverseString {

	public static void main(String[] args) {

		String a = "muthu";
		char[] arr = a.toCharArray();
		System.out.println(arr.length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j >= 0; j--) {
				arr[i] = arr[j];
			}
		}
		System.out.println(arr);
	}  

}
