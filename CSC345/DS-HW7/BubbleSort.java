
public class BubbleSort extends Driver
{
	/*
	 * Ascending Bubble Sort algorithm method
	 */
	void bubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
		{
			for (int j = 0; j < n - i - 1; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					// swap arr[j+1] and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	/*
	 * Descending Bubble Sort algorithm method
	 */
	void bubbleSortreverse(int arr[])
	{
		int n = arr.length;
		for (int i = n - 1; i >= 0; i--)
		{
			for (int j = n - 1; j > 0; j--)
			{
				if (arr[j - 1] < arr[j])
				{
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	/*
	 * Print ascending Bubble Sort
	 */
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
	
	/*
	 * Print descending Bubble Sort
	 */
	void printArrayreverse(int arr[])
	{
		int n =arr.length;
		for (int i = 0; i < n; i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
}
