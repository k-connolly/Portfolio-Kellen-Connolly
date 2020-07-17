
public class SelectionSort extends Driver
{
	/*
	 * Ascending Selection Sort algorithm
	 */
	void sortSelection(int arr3[])
	{
		int n = arr3.length;
		
		//one by one move boundry of unsorted subarray
		for (int i = 0; i < n - 1; i++)
		{
			//Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
			{
				if (arr3[j] < arr3[min_idx]) 
				{
					min_idx = j;
				}				
			}
			int temp = arr3[min_idx];
			arr3[min_idx] = arr3[i];
			arr3[i] = temp;
		}
	}
	
	/*
	 * Descending Selection Sort algorithm
	 */
	void sortSelectionreverse(int arr3[])
	{
		int n = arr3.length;
		
		for (int i = 0; i < n - 1; i++)
		{
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
			{
				if (arr3[j] > arr3[min_idx])
				{
					min_idx = j;
				}
			}
			int temp = arr3[min_idx];
			arr3[min_idx] = arr3[i];
			arr3[i] = temp;
		}
	}
	
	/*
	 * Print Ascending Selection Sort
	 */
	void printSelectionArray(int arr3[])
	{
		int n = arr3.length;
		for (int i = 0; i < n; i++) 
		{
			System.out.println(arr3[i] + " ");
		}
	}
	
	/*
	 * Print Descending Selection Sort
	 */
	void printSelectionArrayreverse(int arr3[]) 
	{
		int n = arr3.length;
		for (int i = 0; i < n; i++)
		{
			System.out.println(arr3[i] + " ");
		}
	}
}
