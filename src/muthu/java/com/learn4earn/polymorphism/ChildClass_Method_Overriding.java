package com.learn4earn.polymorphism;

public class ChildClass_Method_Overriding extends ParentClass_Method_Overriding {

	public static void main(String[] args) {

		ChildClass_Method_Overriding child = new ChildClass_Method_Overriding();
		child.help();
		child.init();

		// ChildClass_Method_Overriding childParent = new ParentClass_Method_Overriding(); // gives error and asks to change like next line

//		ChildClass_Method_Overriding childParent = (ChildClass_Method_Overriding) new ParentClass_Method_Overriding();  // giving casting exception
//		childParent.help(); 
//		childParent.init();
		 
		ParentClass_Method_Overriding parent = new ParentClass_Method_Overriding();
		parent.help();
		parent.init();

		ParentClass_Method_Overriding parentChild = new ChildClass_Method_Overriding();
		parentChild.help();  // Calls ParentClass_Method_Overriding help() method but prints ChildClass_Method_Overriding help() method statement since that method is overridden by the child class
		parentChild.init();  // Calls ParentClass_Method_Overriding init() method but prints ChildClass_Method_Overriding init() method statement since that method is overridden by the child class
		parentChild.help(5); // Calls ParentClass_Method_Overriding help(int i) method and prints the same method statement since that method is not overridden by the child class
		
	}

	public void help() {
		System.out.println("Child help");
	}

	protected String init() {
		System.out.println("Child init");
		return null;
	}

}
