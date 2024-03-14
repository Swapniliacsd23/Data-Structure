package sorting;

import java.util.Arrays;

public class SortingMainInsertionSort {
	
	public static void InsertionSort(int arr[]) {
		// n-1 passes, consider ith element as the last element of array
		for(int i=1; i<arr.length; i++) {
			// copy last element into temp variable
			int temp=arr[i],j;
			// compare temp with all elements before that
			// find approprite position for the element
			// and insert temp at that position
			for(j=i-1; j>=0 && arr[j]>temp; j--) {
					arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
			// for printing after each pass
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6, 4, 2, 8, 3, 1};
		//for sorted array
		//int[] arr = {1, 2, 3, 4, 6, 8};

		System.out.println("Before: "+Arrays.toString(arr));
		InsertionSort(arr);
		System.out.println("After: "+Arrays.toString(arr));
	}

}
