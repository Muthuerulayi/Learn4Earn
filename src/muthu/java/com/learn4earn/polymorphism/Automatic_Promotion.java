package com.learn4earn.polymorphism;

public class Automatic_Promotion {

	public static void main(String[] args) {

		Automatic_Promotion autoProm = new Automatic_Promotion();
		
		autoProm.display(1076565654);
		autoProm.display("Girl");
		autoProm.display('a');
		autoProm.display(123);
		//autoProm.display(54d);
		autoProm.display(23l);
		autoProm.display(8.5f);

	}
	
	public void display(float fl) {
		System.out.println("Float");
	}
	
//	public void display(long lg) {
//		System.out.println("Long");
//	}
	
	public void display(String j) {
		System.out.println("String");
	}
	
	public int display(int i) {
		System.out.println("Integer");
		return i;
	}
	
	public static int display1(int i) {  // This method is called by Main_Method_Overloading class' static main method for some experiment purpose
		System.out.println("Integer");
		return i;
	}
	
//	public void display(double db) {
//		System.out.println("Double");
//	}

}
