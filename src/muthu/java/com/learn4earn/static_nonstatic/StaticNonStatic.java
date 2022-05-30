package com.learn4earn.static_nonstatic;

public class StaticNonStatic {
	
	// Global variables
	static String name;
	static int studId;
	char grade;
	double marks;
	
	public static void main(String[] args) {
		
		// Calling static members of the class
		name = "Muthu";
		studId = 1;                         // We have to assign some values to the variables which are already declared globally
		StaticNonStatic.name = "My Name";
		StaticNonStatic.studId = 2;
		
		System.out.println(studId + " " + name);
		
		firstTest();
		secondTest();
		StaticNonStatic.firstTest();
		StaticNonStatic.secondTest();
		
		//grade = 'A';  // Calling non-static member using class name or directly by its name from static method leads to error
		//StaticMainMethod.grade = 'A';  // We need to create an object of the class to call non-static member from static method
		
		StaticNonStatic methd = new StaticNonStatic();
		
		// Calling non-static members using an object of the class
		methd.grade = 'A';
		methd.marks = 98;
		
		System.out.println(methd.grade + " " + methd.marks);
		
		methd.firstExam();
		methd.finalExam();
		
		//methd.name = "Chitra"; // Calling static member as like non-static => gives warning

	}
	
	public static void firstTest() {
		
		// Local variables are neither static nor non-static
		String subjectFirstTest = "Maths";
		int totalFirstTest = 100;
		// static int rollno = 1; // throws an error (illegal modifier static)
		// public int rollno = 1; // throws an error (illegal modifier public)
		
		System.out.println(subjectFirstTest + " " + totalFirstTest);
		
		secondTest();
		
		StaticNonStatic obj2 = new StaticNonStatic();
		obj2.firstExam();
		
		
	}
	
	public static void secondTest() {

		// Local variables
		String subjectSecondTest = "Science";
		int totalSecondTest = 90;

		System.out.println(subjectSecondTest + " " + totalSecondTest);

	}
	
	public void firstExam() {
		
		// Local variables
		String subjectFirstExam = "English";
		int totalFirstExam = 80;

		System.out.println(subjectFirstExam + " " + totalFirstExam);
		
		// non-static method can call both static and non-static members directly by their name or by using the class name
		// There is no need of objects
		firstTest();
		secondTest();
		firstExam();
		finalExam();
		
		StaticNonStatic.firstTest();
		StaticNonStatic.secondTest();
		StaticNonStatic.studId = 5;
		//StaticMainMethod.main(null);
		//main(null);
		
		//subjectFirstTest = "EVS"; // calling local variables of another method gives error
		
	}
	
	public void finalExam() {

		// Local variables
		String subjectFinalExam = "Engineering";
		int totalFinalExam = 70;

		System.out.println(subjectFinalExam + " " + totalFinalExam);
		
	}

}
