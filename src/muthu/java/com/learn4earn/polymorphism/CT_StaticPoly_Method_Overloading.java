package com.learn4earn.polymorphism;

public class CT_StaticPoly_Method_Overloading {

	public static void main(String[] args) {

		CT_StaticPoly_Method_Overloading obj = new CT_StaticPoly_Method_Overloading();
		obj.show();
		System.out.println(obj.show(1));
		obj.show(2, 3);
		System.out.println(obj.show(2, 3, 4));
		obj.show("automation");
		System.out.println(obj.show("automation", "selenium"));
		obj.show(new StringBuffer("Python"));
		obj.show(new StringBuilder("PHP"));
		obj.show(obj);
		//obj.show(obj,obj);
		obj.show("S",6);
	}

	public void show() {
		System.out.println("This is a simple method with no parameters");
	}

	public int show(int i) {
		System.out.println("This is a method with one int type parameter");
		return i*100;
	}

	public void show(int i, int j) {
		System.out.println("This is a method with two int type parameters");
	}

	public int show(int i, int j, int k) {
		System.out.println("This is a method with three int type parameters");
		return i+j*k;
	}

	public void show(String S) {
		System.out.println("This is a method with one String type parameter");
	}
	
	public String show(String S, String S1) {
		System.out.println("This is a method with two String type parameters");
		return S+" "+S1;
	}
	
	public void show(StringBuffer S2) {
		System.out.println("This is a StringBuffer method");
	}
	
	public void show(StringBuilder S3) {
		System.out.println("This is a StringBuilder method");
	}
	
	public Object show(Object obj) {
		System.out.println("This is Object Class with one object parameter");
		return null;
	}
	
	public void show(Object obj, Object obj1) {
		System.out.println("This is Object Class with two object parameters");
		//return null;
	}

}
