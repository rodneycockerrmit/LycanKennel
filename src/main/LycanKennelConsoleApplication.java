
package main;

import view.console.TestKennel;

/*
 * LycanKennelConsoleApplication
 * version 1.0
 * 13/02/2019
 * © 2015 Rodney Cocker
 */
public class LycanKennelConsoleApplication 
{

	/* This is a system method called by the Java Virtual Machine (JVM)
	 *every java program must have a main method in the class that 
	 * represents the start point of the program.*/
	public static void main(String[] args)
	{
		/* This line takes the TestDog class we wrote and creates 
		 * a copy of it in memory */
		TestKennel testDog = new TestKennel();
		
		// Once created we can then use the class by calling its methods.
		testDog.test();
		
		System.out.println("And around; the merry go round we go.")
		
	}
}
