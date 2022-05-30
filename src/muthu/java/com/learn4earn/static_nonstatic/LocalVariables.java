package com.learn4earn.static_nonstatic;

public class LocalVariables {

	public static void main(String[] args) {
		
		System.out.println(LocalVariables.sum());
		
		LocalVariables objref = new LocalVariables();
		objref.div();
		//objref.div().k; // not allowed/not valid

	}
	
	// Global or Class variables
	String city;
	static String country;

	public static int sum() {
		int i = 10;
		int j = 20;
		int k = i + j;
		System.out.println(k);
		return k;
	}
	
	public void div() {
		int k = 30;
		int l = 40;
		int m =l/k;
		System.out.println(m);
		
		city = "kgf";
		country = "CA";
	}
}
