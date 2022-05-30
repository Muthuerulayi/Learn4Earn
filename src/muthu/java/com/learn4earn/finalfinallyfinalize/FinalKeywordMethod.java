package com.learn4earn.finalfinallyfinalize;

public class FinalKeywordMethod {

	    final void rr() {}
	    public static void main(String[] args)
	    {
	    }
	}
	  
	class ChildClass extends FinalKeywordMethod {
	  
	    // Here we get compile time error
	    // since can't extend rr since it is final.
	    //void rr() {}
	}
	
