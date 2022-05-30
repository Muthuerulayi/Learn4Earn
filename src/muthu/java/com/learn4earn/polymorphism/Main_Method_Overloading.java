package com.learn4earn.polymorphism;

public class Main_Method_Overloading {

	public static void main(String[] args) {
		System.out.println("MAIN");
		main(10);
		main(new String[3], new String[2]);
		
		// Tried to clear some confusion about inheritance concept
//		Automatic_Promotion autoProm1 = new Automatic_Promotion();
//		System.out.println(autoProm1.display(300));
		
		Automatic_Promotion.display1(20);
		
		// Main_Method_Overloading mainOverload = new Automatic_Promotion(); // gives compile time error since there is no inheritance relationship between these two classes
		
	}
	
	public static void main(int i) {
		System.out.println("MAIN with int parameter");

	}
	
	public static void main(String[] args, String[] args1) {
		System.out.println("MAIN with two string array parameters");

	}
	
	public void myMeth(int i) {
		System.out.println("MAIN with int parameter");

	}

}
