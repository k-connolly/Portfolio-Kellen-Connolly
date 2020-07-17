
public class BinarySearch 
{
	/*
	 * Maneuvering binary search through other integer elements
	 */
	static int pivotedBinarySearch(int arr[], int n, int key)
	{
		int pivot = findPivot(arr, 0, n - 1);
		if (pivot == -1)
		{
			return binarySearch(arr, 0, n - 1, key);
		}
		if (arr[pivot] == key)
		{
			return pivot;
		}
		else if (arr[0] <= key)
		{
			return binarySearch(arr, 0 , pivot - 1, key);
		}
		return binarySearch(arr, pivot + 1, n - 1, key);
	}
	
	/*
	 * Finding the pivot point for searching specified user input number
	 */
	static int findPivot(int arr[], int low, int high)
	{
		if (high < low)
		{
			return -1;
		}
		if (high == low)
		{
			return low;
		}
		
		int mid = (low + high)/2;
		if (mid < high && arr[mid] > arr[mid + 1])
		{
			return mid;
		}
		else if (mid > low && arr[mid] < arr[mid - 1])
		{
			return (mid - 1);
		}
		else if (arr[low] >= arr[mid])
		{
			return findPivot(arr, low, mid - 1);
		}
		return findPivot(arr, mid + 1, high);
	}
	
	/*
	 * Binary search algorithm to search of user input number
	 * that searches the random integer array
	 */
	static int binarySearch(int arr[], int low, int high, int key)
	{
		if (high < low)
		{
			return -1;
		}
		
		int mid = (low + high)/2;
		if (key == arr[mid])
		{
			return mid;
		}
		else if (key > arr[mid])
		{
			return binarySearch(arr, mid + 1, high, key);
		}
		return binarySearch(arr, low, mid - 1, key);
	}
}
