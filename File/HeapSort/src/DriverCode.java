
public class DriverCode {
	static void printArray(int arr[])
	{
		int size = arr.length;
		for (int i = 0; i < size; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String args[])
	{

		
		int arr[] = { 10,3,4,5,6,7,9};
		int size = arr.length;

		HeapSortMax HMIN = new HeapSortMax();
		HMIN.sort(arr);

		System.out.println("Sorted array is: ");
		printArray(arr);
	}
}
