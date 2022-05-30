package com.learn4earn.static_nonstatic;

public class StaticMainMethod {

	public static void main(String[] args) {

		StaticMainMethod objref = new StaticMainMethod();
		objref.finalExam();
		System.out.println("This is the main method");

	}
	
	public void finalExam() {

		// Local variables
		String subjectFinalExam = "Engineering";
		int totalFinalExam = 70;

		System.out.println(subjectFinalExam + " " + totalFinalExam);
		
		//main(null); not a valid code. No other methods can call static main method in any ways
		
	}

}
