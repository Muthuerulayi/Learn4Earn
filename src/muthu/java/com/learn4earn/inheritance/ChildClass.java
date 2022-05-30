package com.learn4earn.inheritance;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		
		ChildClass child = new ChildClass();
		
		// Calling ChildClass Methods
		child.iPhone();
		computer();
	
		// Calling ParentClass Methods
		child.royalEnfield();
		bellBottom();
		
		// Calling GrandParentClass Methods
		child.vintageCar();
		glasses();
		child.cane();
		
		ParentClass parent = new ParentClass();
		
		//parent.iPhone(); Parent can't inherit Child's properties
		parent.royalEnfield();
		bellBottom();
		
		parent.vintageCar();
		parent.cane();
		
		GrandParentClass grandParent = new GrandParentClass();
		
//		grandParent.iPhone();
//		grandParent.royalEnfield();  // GrandParent can't inherit both Parent and Child's properties
		grandParent.cane();
		grandParent.vintageCar();
		
		GrandParentClass.glasses();
		ParentClass.glasses();  // accessing GrandParent's static glasses() method
		ParentClass.bellBottom();
		ChildClass.glasses();  // accessing both Parent and GrandParent's static methods glasses(), bellBottom()
		ChildClass.bellBottom();
		ChildClass.computer();
		
//		ParentClass parentToChild = new ChildClass();                 // These kind of objects can also be created which are useful when method overriding happens
//		GrandParentClass grandParentToParent = new ParentClass();     // Refer polymorphism method overriding examples

	}
	
	public void iPhone() {
		System.out.println("My mobile phone");
	}
	
	public static void computer() {
		System.out.println("My laptop");
	}

}
