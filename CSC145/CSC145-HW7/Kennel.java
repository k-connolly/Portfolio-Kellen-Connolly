import java.util.Scanner;
public class Kennel 
{
	// Main Method to Initiate Program //
	public static void main(String[] args) 
	{
		// Declarations //
		String name;
		int age = 0;
		
	// Scanner for User input of new dog //
	Scanner INPUT = new Scanner(System.in);
		
		// Input for Name //
		System.out.println("Enter the dog's name: ");
			name = INPUT.next();
		
		// Input for Age //
		System.out.println("Enter the dog's age: ");
			age = INPUT.nextInt();
	
	// Closing Scanner //
	INPUT.close();
		
		// Construction of Multiple Dog Objects //
		Dog dog = new Dog(name, age); // Users Dog
		Dog dog2 = new Dog("Patrick", 8); // Default Dog2
		Dog dog3 = new Dog("Fronz", 3); // Default Dog3
		Dog dog4 = new Dog("Leedle", 6);// Default Dog4


		// Output of the Program //
//-----------------------------------------------------------------------//
			System.out.println(" "); //Spacer//
		System.out.println("List of dogs in Kennel and their ages:");
			System.out.println(" "); //Spacer//
			
		System.out.println(dog);
			System.out.println(" "); //Spacer//
		System.out.println(dog2);
			System.out.println(" "); //Spacer//
		System.out.println(dog3);
			System.out.println(" "); //Spacer//
		System.out.println(dog4);
//-----------------------------------------------------------------------//
	}
}
