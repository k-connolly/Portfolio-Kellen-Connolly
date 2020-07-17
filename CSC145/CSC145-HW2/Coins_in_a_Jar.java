import java.util.Scanner;
/*
 * This program takes the users input
 * of the amount of coins in a jar by
 * totaling the amount of quarters, dimes
 * nickels, and pennies
 */
public class Coins_in_a_Jar {

	public static void main(String[] args) 
	{
		//Value of coins in Jar//
	int quarters, dimes, nickels, pennies;
	int total;
	
			//User input and variables//
		Scanner in = new Scanner(System.in);
			System.out.print("Number of Quarters from Jar: ");
				quarters = in.nextInt();
			System.out.print("Number of Dimes from Jar: ");
				dimes = in.nextInt();
			System.out.print("Number of Nickels from Jar: ");
				nickels = in.nextInt();
			System.out.print("Number of Pennies from Jar: ");
				pennies = in.nextInt();
				
	// Math of Cents for Amount
	int total_cents = 25 * quarters + dimes * 10 + nickels * 5 + pennies;
		total = total_cents/100; //total for dollar
			total_cents = total_cents%100; //total for cents
			
			//Print out all//
			System.out.println("Total is $" + total + " and " + total_cents + " cents.");
	in.close();
	}

}
