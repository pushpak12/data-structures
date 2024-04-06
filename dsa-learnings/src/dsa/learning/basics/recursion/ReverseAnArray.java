package dsa.learning.basics.recursion;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements in an array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

//		reverseAnArrayApproach1(arr, n);
//		reverseAnArrayApproach2(arr, n);
//		reverseAnArrayUsingRecursion(arr, 0, n-1);
//		printArray(arr);

//		Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//		reverseAnArrayUsingBuiltInFunction(boxedArray);
//		for(Integer i : boxedArray) {
//			System.out.print(i+" ");
//		}

	}

	// Approach 1 : Using for loop

	public static void reverseAnArrayApproach1(int arr[], int n) {
		int[] reversedArray = new int[n];
		int j = 0;
		for (int i = n - 1; i >= 0; i--) {
			reversedArray[i] = arr[j];
			j++;
		}
		printArray(reversedArray);
	}

	// Approach 2 : Using two pointers approach

	public static void reverseAnArrayApproach2(int arr[], int n) {
		int p1 = 0;
		int p2 = n - 1;
		while (p1 < p2) {
			int temp = arr[p1];
			arr[p1] = arr[p2];
			arr[p2] = temp;
			p1++;
			p2--;
		}
		printArray(arr);
	}

	// Approach 3 : Using recursion
	public static void reverseAnArrayUsingRecursion(int arr[], int start, int end) {
		if (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			reverseAnArrayUsingRecursion(arr, start + 1, end - 1);
		}
	}

	// Approach 4 : Using built-in function

	public static void reverseAnArrayUsingBuiltInFunction(Integer arr[]) {
		Collections.reverse(Arrays.asList(arr));
	}

	// print array elements
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
