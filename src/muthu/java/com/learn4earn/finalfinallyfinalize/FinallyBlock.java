package com.learn4earn.finalfinallyfinalize;

//Java program to illustrate
//use of finally block
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class K {
	//private static final int SIZE = 10;
	public static void main(String[] args)
	{

		PrintWriter out = null;
		try {
			System.out.println("Entered try statement");

			// PrintWriter, FileWriter
			// are classes in io package
			out = new PrintWriter(new FileWriter("OutFile.txt"));
		}
		catch (IOException e) {
			// Since the FileWriter in
			// try block can throw IOException
		}

		// Following finally block cleans up
		// and then closes the PrintWriter.

		finally
		{
			if (out != null) {
				System.out.println("Closing PrintWriter");
				out.close();
			} else {
				System.out.println("PrintWriter not open");
			}
		}
	}
}


//A Java program to demonstrate finally.
public class FinallyBlock {
	
	// A method that throws an exception and has finally.
	// This method will be called inside try-catch.
	static void A()
	{
		try {
			System.out.println("inside A");
			throw new RuntimeException("demo");
		}
		finally
		{
			System.out.println("A's finally");
		}
	}

	// This method also calls finally. This method
	// will be called outside try-catch.
	static void B()
	{
		try {
			System.out.println("inside B");
			return;
		}
		finally
		{
			System.out.println("B's finally");
		}
	}

	public static void main(String args[])
	{
		try {
			A();
		}
		catch (Exception e) {
			System.out.println("Exception caught");
		}
		B();
	}
}


//Java program to illustrate finally in
//Case where exceptions do not
//occur in the program
class B {
	public static void main(String[] args)
	{
		int k = 55;
		try {
			System.out.println("In try block");
			int z = k / 55;
			System.out.println(z);
		}

		catch (ArithmeticException e) {
			System.out.println("In catch block");
			System.out.println("Dividing by zero but caught");
		}

		finally
		{
			System.out.println("Executes whether exception occurs or not");
		}
	}
}


//Java program to illustrate finally in
//Case where exceptions occur
//and match in the program
class C {
	public static void main(String[] args)
	{
		int k = 66;
		try {
			System.out.println("In try block");
			int z = k / 0;
			// Carefully see flow doesn't come here
			System.out.println("Flow doesn't came here");
			System.out.println(z);
		}

		catch (ArithmeticException e) {
			System.out.println("In catch block");
			System.out.println("Dividing by zero but caught");
		}

		finally
		{
			System.out.println("Executes whether an exception occurs or not");
		}
	}
}


//Java program to illustrate finally in
//Case where exceptions occur
//and do not match any case in the program
class D {
	public static void main(String[] args)
	{
		int k = 15;
		try {
			System.out.println("In try block");
			int z = k / 0;
			System.out.println(z);
		}

		catch (NullPointerException e) {
			System.out.println("In catch block");
			System.out.println("Dividing by zero but caught");
		}

		finally
		{
			System.out.println("Executes whether an exception occurs or not");
		}
	}
}