
public class InsertionSort extends Driver
{
	/*
	 * Ascending Insertion sort algorithm method
	 */
	void sortInsertion(int arr2[])
	{
		int n = arr2.length;
		for (int i = 1; i < n; i++) 
		{
			int key = arr2[i];
			int j = i - 1;
			/*
			 * Move Elements of arr[0..i-1], that are
			 * greater than key, to one position ahead
			 * of their current position.
			 */
			while (j >= 0 && arr2[j] > key)
			{
				arr2[j + 1] = arr2[j];
				j = j - 1;
			}
			arr2[j + 1] = key;
		}
	}
	
	/*
	 * Descending Insertion Sort algorithm method
	 */
	void sortInsertionreverse(int arr2[])
	{
		int n = arr2.length;
		for (int i = 1; i < n; i++)
		{
			int j = i - 1;
			int key = arr2[i];
			
			while (j >= 0 && arr2[j] < key)
			{
				arr2[j + 1] = arr2[j];
				j--;
			}
			arr2[j + 1] = key;
		}
	}
	
	/*
	 * Print Ascending Insertion Sort
	 */
	void printInsertionArray(int arr2[])
	{
		int n = arr2.length;
		for (int i = 0; i < n; i++)
		{
			System.out.println(arr2[i] + " ");
		}
	}
	
	/*
	 * Print Descending Insertion Sort
	 */
	void printInsertionArrayreverse(int arr2[])
	{
		int n = arr2.length;
		for (int i = 0; i < n; i++)
		{
			System.out.println(arr2[i] + " ");
		}
	}
}
