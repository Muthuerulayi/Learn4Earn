package com.learn4earn.javaprogramming;

public class DataTypes_DefaultValues {

	static boolean bool;
	static char c;
	static String s;
	static Object[] obj1;
	//static int[] s1 = {1, 2, 3};
	static byte b;
	static short sh;
	static int i;
	static long l;
	static float f;
	static double d;
	
	public static void main(String[] args) {

		System.out.println(bool);
		System.out.println(c);
		System.out.println(s);
		System.out.println(obj1);
		System.out.println(b);
		System.out.println(sh);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println();
		
		s = "Muthu";
		obj1 = new Object[3];
		//s1 = {1, 2, 3};
		System.out.println(s);
		
		//Non-Primitive Data Types
		System.out.println(s.getClass().getSimpleName());
		System.out.println(obj1.getClass().getSimpleName());
		
		//Primitive Data Types
		System.out.println(((Object)c).getClass().getSimpleName());
		System.out.println(((Object)b).getClass().getSimpleName());
		System.out.println(((Object)sh).getClass().getSimpleName());
		System.out.println(((Object)i).getClass().getSimpleName());
		System.out.println(((Object)l).getClass().getSimpleName());
		System.out.println(((Object)f).getClass().getSimpleName());
		System.out.println(((Object)d).getClass().getSimpleName());

	}

}
