package com.learn4earn.strings;

public class StringImmutable {

	public static void main(String[] args) {

		String s1 = "java";
		//s1.concat(" rules");
		concat1(s1);
		
		System.out.println(s1.replace('a', 'u'));
		
		// This can make s1 as "java rules"
		//s1 = s1.concat(" rules");  // OR
		//s1 = s1 + " rules";

		// Yes, s1 still refers to "java"
		System.out.println("s1 refers to " + s1);
		System.out.println("Length of s1: " + s1.length());

	}
	
	public static void concat1(String str) {
		str = str + " rules";
		System.out.println("str refers to " + str);
		System.out.println("Length of str: " + str.indexOf('r'));
	}

}
