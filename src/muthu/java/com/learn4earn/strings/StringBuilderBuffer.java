package com.learn4earn.strings;
// Java program to demonstrate difference between
// String, StringBuilder and StringBuffer

// Main class
class StringBuilderBuffer {

	// Method 1
	// Concatenates to String
	public static String concat1(String s1)
	{
		return s1 = s1 + "forgeeks";
	}

	// Method 2
	// Concatenates to StringBuilder
	public static void concat2(StringBuilder s2)
	{
		s2.append("forgeeks");
	}

	// Method 3
	// Concatenates to StringBuffer
	public static void concat3(StringBuffer s3)
	{
		s3.append("forgeeks");
	}

	// Method 4
	// Main driver method
	public static void main(String[] args)
	{
		// Custom input string
		// String 1
		String s1 = "Geeks";

		// Calling above defined method
		concat1(s1);

		// s1 is not changed
		System.out.println("String: " + s1);

		// String 1
		StringBuilder s2 = new StringBuilder("Geeks");

		// Calling above defined method
		concat2(s2);

		// s2 is changed
		System.out.println("StringBuilder: " + s2);

		// String 3
		StringBuffer s3 = new StringBuffer("Geeks");

		// Calling above defined method
		concat3(s3);

		// s3 is changed
		System.out.println("StringBuffer: " + s3);
	}
}


//Java program to demonstrate conversion from
//String to StringBuffer and StringBuilder

//Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		// Custom input string
		String str = "Geeks";

		// Converting String object to StringBuffer object
		// by
		// creating object of StringBuffer class
		StringBuffer sbr = new StringBuffer(str);

		// Reversing the string
		sbr.reverse();

		// Printing the reversed string
		System.out.println(sbr);

		// Converting String object to StringBuilder object
		StringBuilder sbl = new StringBuilder(str);

		// Adding it to string using append() method
		sbl.append("ForGeeks");

		// Print and display the above appended string
		System.out.println(sbl);
	}
}


//Java Program to Demonstrate Conversion from
//String to StringBuffer and StringBuilder

//Main class
class GFG1 {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating objects of StringBuffer class
		StringBuffer sbr = new StringBuffer("Geeks");
		StringBuilder sbdr = new StringBuilder("Hello");

		// Converting StringBuffer object to String
		// using toString() method
		String str = sbr.toString();

		// Printing the above string
		System.out.println(
			"StringBuffer object to String : ");
		System.out.println(str);

		// Converting StringBuilder object to String
		String str1 = sbdr.toString();

		// Printing the above string
		System.out.println(
			"StringBuilder object to String : ");
		System.out.println(str1);

		// Changing StringBuffer object sbr
		// but String object(str) doesn't change
		sbr.append("ForGeeks");

		// Printing the above two strings on console
		System.out.println(sbr);
		System.out.println(str);
	}
}


//Java program to Demonstrate conversion from
//String to StringBuffer and StringBuilder

//Main class
class GFG2 {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating object of StringBuffer class and
		// passing our input string to it
		StringBuffer sbr = new StringBuffer("Geeks");

		// Storing value StringBuffer object in String and
		// henceforth converting StringBuffer object to
		// StringBuilder class
		String str = sbr.toString();
		StringBuilder sbl = new StringBuilder(str);

		// Printing the StringBuilder object on console
		System.out.println(sbl);
	}
}
