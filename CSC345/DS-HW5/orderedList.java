import java.util.Arrays;

public class orderedList 
{
	//Creating the scores array with 10 elements
	private int[] Scores = new int[10];
	
	//Inserts and sorts elements in the scores array
	public void insertElement(int a, int b)
	{
		for (int i = 0; i < 10; i++)
		{
			//if a > any element in 'Scores' then each smaller value is
			//pushed lower in the 'Scores' array, lowest score is then removed
			//from the array
			if (Scores[i] < a)
			{
				for (int j = 9; j > i; j--)
				{
					Scores[j] = Scores[j - 1];
				}
				
				Scores[i] = a;
				
				if (b != 0)
				{
					System.out.println("New HighScores!\n" + display());
					System.out.println("");//Spacer
				}
				
				//breaks when condition is evaluated
				break;
			}
		}
	}

	//String method that displays values in the 'Scores' array
	public String display()
	{
		return Arrays.toString(Scores);
	}
}
