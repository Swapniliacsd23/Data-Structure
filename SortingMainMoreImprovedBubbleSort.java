package sorting;

import java.util.Arrays;

public class SortingMainMoreImprovedBubbleSort {

	public static void MoreImprovedBubbleSort(int[] arr) {
		// execute after n-1 passes
				for(int i=0; i<arr.length-1; i++) {
					boolean swapFlag = false;
					for(int j=0; j<arr.length-1-i; j++) {
						//compare consecutive numbers
						//if left element is greater then right element then swap
						if(arr[j]>arr[j+1]) {
							int temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1] = temp;
							swapFlag = true;
						}
					}
					if(!swapFlag)
						break;
					// for printing after each pass
					System.out.println(Arrays.toString(arr));
				}
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for unsorted array
		int[] arr = {6, 4, 2, 8, 3, 1};
		//for sorted array
		//int[] arr = {1, 2, 3, 4, 6, 8};

		System.out.println("Before: "+Arrays.toString(arr));
		MoreImprovedBubbleSort(arr);
		System.out.println("After: "+Arrays.toString(arr));
	}

}
