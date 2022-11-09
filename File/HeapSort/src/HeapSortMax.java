/* it can be defined as a two binary tree where each node has one key*/
public class HeapSortMax {
	void sort(int arr[])
	{
		int n = arr.length;

		// Build heap using the HeapMax method 
		
		for (int i = n / 2 - 1; i >= 0; i--)
			HeapMax(arr, n, i);

		for (int i = n - 1; i > 0; i--) {
			// Switch current root to end positions
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// call max HeapMax on the reduced heap
			HeapMax(arr, i, 0);
		}
	}

	//  The  implemented the max heap 
	void HeapMax(int arr[], int n, int i)
	{
		int MaxH = i; // Initialize MaxH as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

		// If left child is larger than root
		
		if (l < n && arr[l] > arr[MaxH])
			MaxH = l;

		// If right child is larger than MaxH so far
		
		if (r < n && arr[r] > arr[MaxH])
			MaxH = r;

		// If MaxH is not root
		if (MaxH != i) {
			int swap = arr[i];
			arr[i] = arr[MaxH];
			arr[MaxH] = swap;

			
			HeapMax(arr, n, MaxH);
		}
	}	
}
