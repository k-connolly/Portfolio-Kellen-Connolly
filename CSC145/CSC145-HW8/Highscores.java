import java.util.Scanner;
public class Highscores 
{

	public static void main(String[] args) 
	{
		// Creating array with 5 indexes //
		Player array[] = new Player[5];
		
		// Variable Declaration //
		String name, score;
		
		// Scanner //
		Scanner input = new Scanner(System.in); 
		
		// While loop for user input into array //
		int i = 0;
		while(i < 5)
		{
			// Take user input for name //
			System.out.print("Enter Name: ");
			name = input.nextLine(); 

			// Take user input for score //
			System.out.print("Enter Score: ");
			score = input.nextLine();    

			array[i] = new Player(name, score);
			   
			i++;
		}	
		
		// Display array in the toString format //
		for(int k =0; k < array.length; k++)
		{
			System.out.println(array[k].toString());
		}
		
		input.close(); //close Scanner
	}

}
