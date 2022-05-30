package com.learn4earn.javaprogramming;

public class StringClass {

	public static void main(String[] args) {

		// WHY??????? CHECK???????
		String s1 = "Muthu";  // Only 1 object is created in SCP/SLP memory as "Muthu" and referred by s1
		String s2 = new String("Muthu"); // 2 objects created. 1 in Heap memory as "Muthu" and referred by s2 
		                                 // Another object also in SCP/SLP memory as "Muthu" and referred by JVM internal reference not by s2
		System.out.println(s1); // Muthu
		System.out.println(s2); // Muthu
		System.out.println(s1==s2); // FALSE
		                            // Since s1 points to SCP/SLP memory & s2 points to Heap memory it gives the result as FALSE
		
		String s3 = new String();  // Here only 1 object is created inside Heap memory as "Muthu" and referred by s3
		s3 = "Muthu";
		System.out.println(s3==s1); // Since both s1 & s3 are inside SCP/SLP memory it gives the result as TRUE

	}

}
