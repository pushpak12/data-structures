package dsa.learning.arrays.easy;

import java.util.Scanner;

/*
 * 
 * Given an array ‘arr’ of size ‘n’ find the largest element in the array.
 */

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Largest element in an array : "+ largestElementInArray(arr, n));
	}
	
	public static int largestElementInArray(int[] arr, int n) {

		int largest = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}

}
