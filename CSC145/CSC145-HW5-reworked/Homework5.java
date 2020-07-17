
public class Homework5 
{

	public static void main(String[] args) 
	{
		// Nights at which the people are there //
		// Grimli = 1; //
		// Boromir = 2; // 
		// Aragon = 3; //
		// Sam = 4; //
		// Frodo = 5; //
		// Legolas = 6; //
		// Merry = 7; //
		// Pippin = 8; // 
		// Gandalf = 9; //
		
		//Main loop for the nights with if statements //
		for (int night = 1; night <= 2520; night++)
		{
			System.out.println("Night " + night);
			
				// Night check for Grimli //
				boolean Grimli = (night != 0);
				if(Grimli)
				{
					System.out.println("Grimli is at bar.");
					System.out.println(" ");
				}
			
				// Night check for Boromir //
				boolean Boromir = (night%2 == 0);
				if(Boromir)
				{
					System.out.println("Boromir is at bar");
					System.out.println(" ");
				}
				
				// Night check for Aragon //
				boolean Aragon = (night%3 == 0);
				if(Aragon)
				{
					System.out.println("Aragon is at bar.");
					System.out.println(" ");
				}
			
				// Night check for Sam //
				boolean Sam = (night%4 == 0);
				if (Sam)
				{
					System.out.println("Sam is at bar.");
					System.out.println(" ");
				}
				
				// Night check for Frodo //
				boolean Frodo = (night%5 == 0);
				if (Frodo)
				{
					System.out.println("Frodo is at bar.");
					System.out.println(" ");
				}
			
				// Night check for Legolas //
				boolean Legolas = (night%6 == 0);
				if (Legolas)
				{
					System.out.println("Legolas is at bar.");
					System.out.println(" ");
				}
			
				// Night check for Merry //
				boolean Merry = (night%7 == 0);
				if (Merry)
				{
					System.out.println("Merry is at bar.");
					System.out.println(" ");
				}
			
				// Night check for Pippin //
				boolean Pippin = (night%8 == 0);
				if (Pippin)
				{
					System.out.println("Pippin is at bar.");
					System.out.println(" ");
				}
			
				// Night check for Gandalf //
				boolean Gandalf = (night%9 == 0);
				if (Gandalf)
				{
					System.out.println("Gandalf is at bar.");
					System.out.println(" ");
				}
			
			// Finish check where all variable are all true with each other //
			// If one condition is false it loops back till all the variable are true //
			boolean finish = (Grimli && Boromir && Aragon && Sam && Frodo && Legolas && Merry && Pippin && Gandalf);
			if (finish)
			{
				System.out.println("Everyone is here and Gandalf buys them drinks!");
			}
			
		}
	
	}

}
