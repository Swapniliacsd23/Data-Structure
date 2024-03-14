package sorting;

import java.util.Arrays;

public class SortingMainSelectionSort {
	
	public static void SelectionSort(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			//for printing after each pass
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6, 4, 2, 8, 3, 1};
		System.out.println("Selection Sort");
		System.out.println("Before: "+Arrays.toString(arr));
		SelectionSort(arr);
		System.out.println("After: "+Arrays.toString(arr));
	}

}
