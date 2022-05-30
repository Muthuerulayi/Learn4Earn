package com.learn4earn.finalfinallyfinalize;

public class FinalKeywordVariable {

//	public static void main(String[] args)
//    {
//        // Non final variable
//        int a = 5;
//  
//        // final variable
//        final int b = 6;
//  
//        // modifying the non final variable : Allowed
//        a++;
//  
//        // modifying the final variable : 
//        // Immediately gives Compile Time error.
//        b++;
//    }
	
	//declaring final variable  
	final int age = 18;  
	void display() {  

		// reassigning value to age variable   
		// gives compile time error  
		//age = 55;  
	}  

	public static void main(String[] args) {  

		FinalKeywordVariable obj = new FinalKeywordVariable();  
		// gives run time error  
		obj.display();  
	}  

}
