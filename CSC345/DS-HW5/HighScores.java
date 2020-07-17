import java.util.Random;

public class HighScores 
{

	public static void main(String[] args) 
	{
		//Objects
		orderedList oList = new orderedList();
		Random randNum = new Random();
		
		//Filling the indexes of orderList
		for (int i = 0; i < 10; i++)
		{
			oList.insertElement(randNum.nextInt(1001), 0);
		}
		
		//For formatting output 
		System.out.println("------------------ORIGINAL_SCORES-----------------");
		System.out.println(oList.display() + "\n--------------------------------------------------");
		System.out.println(""); //Spacer
		
		//Cycles through the next iteration of 10 scores, displays new score that is inserted
		for (int i = 0; i < 10; i++)
		{
			oList.insertElement(randNum.nextInt(1001), 1);
		}
		
	}

}
