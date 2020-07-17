import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Driver 
{
	/*
	 * Declarations and object variables
	 */
	static int size = 100;
	static BubbleSort bubbleObject = new BubbleSort();
	static InsertionSort insertionObject = new InsertionSort();
	static SelectionSort selectionObject = new SelectionSort();
	static BinarySearch bs = new BinarySearch();
	
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		/*
		 * Instance of randomArray method
		 */
		int[] becksArray = randomArray(size);
		
		//Scanner declaration//
		String input = "y";
		Scanner scan = new Scanner(System.in);
		
		/*
		 * While loop to run through the 
		 * options for user inputs and 
		 * sorting selection
		 */
		while (input.equalsIgnoreCase("Y"))
		{
			//While loop input scanner//
			Scanner inputChoice1 = new Scanner(System.in);
			
			// Menu Display //
			System.out.println("----------OPTIONS----------");
			System.out.println("1)\t Bubble Sort (ascend)");
			System.out.println("2)\t Bubble Sort (descend)");
			System.out.println("3)\t Insertion Sort (ascend)");
			System.out.println("4)\t Insertion Sort (descend)");
			System.out.println("5)\t Selection Sort (ascend)");
			System.out.println("6)\t Selection Sort (descend)");
			System.out.println("---------------------------");
			System.out.println("");
			System.out.println("Enter the menu number for the sort Method: ");
			
			//InputChoice declaration//
			int inputChoice2 = inputChoice1.nextInt();
			
			/*
			 * Switch case for executing 
			 * the sorting methods on the 
			 * random array
			 */
			switch (inputChoice2)
			{
				case 1:
					
					//bubble ascend//				
					bubbleObject.bubbleSort(becksArray);
					System.out.println("Sorted Array Using Bubble Sort:");
					bubbleObject.printArray(becksArray);
					
					//Binary Search//
					Scanner binaryInput = new Scanner(System.in);
					System.out.print("Input a random number to be searched: ");
						int userInput = binaryInput.nextInt();
					System.out.println("INDEX of ELEMENT\n" + BinarySearch.pivotedBinarySearch(becksArray, becksArray.length - 1, userInput));
					
					break;
					
				case 2:
					
					//bubble descending//
					bubbleObject.bubbleSortreverse(becksArray);
					System.out.println("Sorted Array Using Reverse Bubble Sort:");
					bubbleObject.printArrayreverse(becksArray);
					
					//Binary Search//
					Scanner binaryInput2 = new Scanner(System.in);
					System.out.print("Input a random number to be searched: ");
						int userInput2 = binaryInput2.nextInt();
					System.out.println("INDEX of ELEMENT\n" + BinarySearch.pivotedBinarySearch(becksArray, becksArray.length - 1, userInput2));
					
					break;
					
				case 3:
					
					//insertion ascend//
					insertionObject.sortInsertion(becksArray);
					System.out.println("Sorted Array Using Insertion Sort:");
					insertionObject.printInsertionArray(becksArray);
					
					//Binary Search//
					Scanner binaryInput3 = new Scanner(System.in);
					System.out.print("Input a random number to be searched: ");
						int userInput3 = binaryInput3.nextInt();
					System.out.println("INDEX of ELEMENT\n" + BinarySearch.pivotedBinarySearch(becksArray, becksArray.length - 1, userInput3));
					
					break;
					
				case 4:
					
					//insertion descend//
					insertionObject.sortInsertionreverse(becksArray);
					System.out.println("Sorted Array Using Reverse Insertion Sort:");
					insertionObject.printInsertionArrayreverse(becksArray);
					
					//Binary Search//
					Scanner binaryInput4 = new Scanner(System.in);
					System.out.print("Input a random number to be searched: ");
						int userInput4 = binaryInput4.nextInt();
					System.out.println("INDEX of ELEMENT\n" + BinarySearch.pivotedBinarySearch(becksArray, becksArray.length - 1, userInput4));
					
					break;
					
				case 5:
					
					//Selection ascend//
					selectionObject.sortSelection(becksArray);
					System.out.println("Sorted Array Using Selection Sort:");
					selectionObject.printSelectionArray(becksArray);
					
					//Binary Search//
					Scanner binaryInput5 = new Scanner(System.in);
					System.out.print("Input a random number to be searched: ");
						int userInput5 = binaryInput5.nextInt();
					System.out.println("INDEX of ELEMENT\n" + BinarySearch.pivotedBinarySearch(becksArray, becksArray.length - 1, userInput5));
					
					break;
					
				case 6:
					
					//Selection descend//
					selectionObject.sortSelectionreverse(becksArray);
					System.out.println("Sorted Array Using Reverse Selection Sort:");
					selectionObject.printSelectionArrayreverse(becksArray);
					
					//Binary Search//
					Scanner binaryInput6 = new Scanner(System.in);
					System.out.print("Input a random number to be searched: ");
						int userInput6 = binaryInput6.nextInt();
					System.out.println("INDEX of ELEMENT\n" + BinarySearch.pivotedBinarySearch(becksArray, becksArray.length - 1, userInput6));
					
					break;
					
				default:
					
					System.out.println("Invalid Option :( ");
					System.out.println("");
					
					break;
			}
			
			System.out.print("Would you like to do another choice? (y/n): ");
			input = scan.next();
				if (input.equals("n"))
				{
					System.out.println("-----------------------------------------");
					System.out.println("\t Program Terminated!");
					System.out.println("-----------------------------------------");
					System.exit(0);
				}
		}
		
		scan.close(); //closing the scanner input
	}
	
	/*
	 * Random integer array method
	 */
	private static int[] randomArray(int size)
	{
		Random rand = new Random();
		int[] array = new int[size];
		
		ArrayList<Integer> check = new ArrayList<Integer>();
		
		for (int i = 0; i < size; i++)
		{
			int item = rand.nextInt(1000) + 1;
			while (check.contains(item))
			{
				item = rand.nextInt(1000) + 1;
			}
			array[i] = item;
			check.add(item);
		}
		return array;
	}

}
