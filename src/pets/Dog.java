
package pets;

/*
 * Dog
 * version 1.0
 * 13/02/2019
 * © 2015 Rodney Cocker
 */
public class Dog 
{
	// An attribute of a class, this one gives the dog a name.
	public String name = "Fido";
	public int age = 10;

	public Dog()
	{
		
	}
	// Gives the animal the ability to talk and introduce him/herself.
	public void talk() 
	{
		// Standard Java command for printing to the console.
		System.out.println("Woof Woof Woof!!!");
		System.out.println("I am " + age * 7 + " years old.");
	}
}
