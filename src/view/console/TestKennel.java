
package view.console;

import java.util.Scanner;
import pets.Dog;


/*
 * TestDog
 * version 1.0
 * 13/02/2019
 * © 2015 Rodney Cocker
 */

public class TestKennel
{
	/*
	 * Tests the creation of a dog and allowing a user to modify
	 * its attributes.
	 */
	public void test()
	{
	
		/*
		 * We are creating a 'dog' object here using the class 'Dog'
		 * we created earlier
		 */
		Dog dog = new Dog();

		/*
		 * System.out.println is provided by the Java framework to 
		 * enable us to print to the screen
		 */
		System.out.println("Hello " + dog.name + ", who's a good dog?");

		/* Here we are calling the method that we created in our 
		 * Dog class. Remember, methods do something, what is this 
		 * method doing? */
		dog.talk();

		/*
		 * This is provided by the Java framework to enable us to get
		 * user input from the user. However, Eclipse doesn't know 
		 * where to find this class so we have to use an import 
		 * statement to tell it where to find it. The Scanner class 
		 * is found in the 'java.util' package.
		 */
		Scanner console = new Scanner(System.in);

		// Let's change the Dog's name
		System.out.println("Please enter a new name for the dog");
		dog.name = console.next();

		/*
		 * Now we have changed the dog's name, let's print out a 
		 * message again with the new name.
		 */
		System.out.println("Hello " + dog.name + ", who's a good dog?");
		
		
		
		console.close();

	}
}
