package com.learn4earn.finalfinallyfinalize;

public class FinalizeMethod {

	public static void main(String[] args)
	{
		
		// In this case String class' finalize method is called to remove the String class' object 's'
//		String s = new String("RR");
//		s = null;
//		System.out.println(s);
		
		// Here our current class' finalize method is called to remove the FinalizeMethod class' object 'finalMethod'
		FinalizeMethod finalMethod = new FinalizeMethod();
		finalMethod = null;
		System.out.println(finalMethod);

		// Requesting JVM to call Garbage Collector method
		System.gc();
		System.out.println("Main Completes");
	}

	// Here overriding finalize method
	public void finalize()
	{
		System.out.println("finalize method overriden");
	}
}


class Bye {
	public static void main(String[] args)
	{
		Bye m = new Bye();

		// Calling finalize method Explicitly.
		//call by programmer but object won't gets destroyed.
		m.finalize();
		//call by programmer but object won't gets destroyed.
		m.finalize();
		//call by Garbage Collector just before destroying the object.
		m = null;

		// Requesting JVM to call Garbage Collector method
		System.gc();
		System.out.println("Main Completes");
	}

	// Here overriding finalize method
	public void finalize()
	{
		System.out.println("finalize method overriden");
	}
}


class Hi {
	public static void main(String[] args)
	{
		Hi j = new Hi();

		// Calling finalize method Explicitly.
		j.finalize();

		j = null;

		// Requesting JVM to call Garbage Collector method
		System.gc();
		System.out.println("Main Completes");
	}

	// Here overriding finalize method
	public void finalize()
	{
		System.out.println("finalize method overriden");
		System.out.println(10 / 0);
	}
}


class RR {
	public static void main(String[] args)
	{
		RR q = new RR();
		q = null;
		System.out.println(q);

		// Requesting JVM to call Garbage Collector method
		System.gc();
		System.out.println("Main Completes");
	}

	// Here overriding finalize method
	public void finalize()
	{
		System.out.println("finalize method overriden");
		System.out.println(10 / 0);
	}
}
