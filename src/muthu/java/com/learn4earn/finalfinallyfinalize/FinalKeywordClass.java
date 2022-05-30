package com.learn4earn.finalfinallyfinalize;

public final class FinalKeywordClass {

	    public static void main(String[] args)
	    {
	        System.out.println("This is the main method");;
	    }
	}

	// here gets Compile time error that
	// we can't extend FinalKeywordClass as it is final.

//	class ChildClass extends FinalKeywordClass {
//	    // more code here with main method
//	}
	

//Java program to illustrate final keyword
final class FinalExample {

	// by default it is final.
	void h() {}

	// by default it is not final.
	static int j = 30;

public static void main(String[] args)
	{
		// See modified contents of variable j.
		j = 36;
		System.out.println(j);
	}
}
