package com.learn4earn.polymorphism;

public class ParentClass_Method_Overriding {

	protected void help() {
		System.out.println("Parent help");
	}
	
	Object init() {  // if no access modifier is specified then it is 'default' access modifier. This is mostly used with interfaces.
		System.out.println("Parent init");
		return null;
	}
	
	public void help(int i) {
		System.out.println("Parent help with int parameter");
	}

}
