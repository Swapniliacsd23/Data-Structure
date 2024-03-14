package sorting;

import java.util.Arrays;

public class SortingMainImprovedBubbleSort {

	public static void ImprovedBubbleSort(int[] arr) {
	// execute after n-1 passes
			for(int i=0; i<arr.length-1; i++) {
				for(int j=0; j<arr.length-1-i; j++) {
					//compare consecutive numbers
					//if left element is greater then right element then swap
					if(arr[j]>arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
				// for printing after each pass
				System.out.println(Arrays.toString(arr));
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6, 4, 2, 8, 3, 1};
		System.out.println("Before: "+Arrays.toString(arr));
		ImprovedBubbleSort(arr);
		System.out.println("After: "+Arrays.toString(arr));
	}

}
