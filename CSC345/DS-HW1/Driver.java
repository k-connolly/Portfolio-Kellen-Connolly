import java.util.Random;
public class Driver 
{
	// The array increments from 0 to 100 of the array's size (index) 
	// and sets a random integer from 0 - 100 to 
	// it then sets that value to one of the variables of xCoord and yCoord 
	// and prints them together as a coordinate pair.
	// It then prints out the time it took to execute the code in milliseconds.
//------------------------------------------------------------------------------------------------//
	
	public static void main(String[] args) 
	{
		//Construction of the x and y values//
		int xCoord[] = new int[300];
		int yCoord[] = new int[300];
		
		//Construction of the Random function
		Random random = new Random();
		
			//For loop that loops though and sets a random number 
			//to the index of the array, cycles through and increments//
			for(int i = 0; i < 300; i++)
			{
				xCoord[i] = (random.nextInt(300));
				yCoord[i] = (random.nextInt(300));
			}
			
			//Calls the method and prints out the statement from the method//
			printPairs(xCoord, yCoord);
				
	}

//------------------------------------------------------------------------------------------------//
	
	//PrintPairs Method//
	public static void printPairs(int xCoord[], int yCoord[]) 
	{
		long startTime = System.currentTimeMillis(); //Start time of process
		
		//For loop that goes through and sets each random integer to an index of the array//
		for(int x : xCoord)
		{
			for(int y : yCoord)
			{
				System.out.println("The Coordinates are: " + "(" + x + ", " + y + ")");
			}
		}
		
		long endTime = System.currentTimeMillis();//End time of process
		
		//Calculation of time it took to process all through the array//
		System.out.println("Coordinates took: " + (endTime - startTime) + " Milliseconds.");
		
	}
	
//------------------------------------------------------------------------------------------------//
	
	//Contains Method//
	public static boolean contains(int yCoord[], int x)
	{
		boolean contains = false;
		
		for(int i : yCoord)
		{
			if(i == x)
			{
				contains = true;
			}
			
			//You wouldn't need this else statement because it would be false
			//by default, but I put it here to force it to stay false if it failed
			else
			{
				contains = false;
			}
		}
		
		return contains;

	}
	
//------------------------------------------------------------------------------------------------//
	
}
