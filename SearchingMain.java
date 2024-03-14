  package searching;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingMain {
	public static int LinearSearch(int[] arr, int key) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key)
				return i;
		}
		return -1;
	}

	public static int BinarySearch(int[] arr, int key) {
		int left = 0, right = arr.length-1, mid;
		while(left <= right) {
			mid = (left + right) / 2;
			if(key == arr[mid])
				return mid;
			if(key < arr[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}
		return -1;
	}
	
	public static int recBinarySearch(int arr[], int left, int right, int key) {
		if(right < left)
			return -1;
		int index, mid = (left + right)/2;
		if(key == arr[mid])
			return mid;
		if(key < arr[mid])
			index = recBinarySearch(arr, left, mid-1, key);
		else
			index = recBinarySearch(arr, mid+1, right, key);
		return  index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {88, 33, 66, 99, 44, 77, 22, 55, 11};
		Arrays.sort(arr);
		System.out.print("Enter key to search: ");
		int key = sc.nextInt();
		
		//LinearSearch can work on sorted or non-sorted array
		int index = LinearSearch(arr, key);
		if(index != -1)
			System.out.println("Key found at index: " + index);
		else
			System.out.println("Key not found");
		
		//can work only on sorted array
		index = BinarySearch(arr, key);
		if(index != -1)
			System.out.println("Key found at index: " + index);
		else
			System.out.println("Key not found");
		
		index = recBinarySearch(arr, 0, arr.length-1, key);
		if(index != -1)
			System.out.println("Key found at index: " + index);
		else
			System.out.println("Key not found");
	}

}
