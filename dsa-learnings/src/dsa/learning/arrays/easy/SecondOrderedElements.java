package dsa.learning.arrays.easy;

import java.util.Scanner;

/*
 * You have been given an array ‘a’ of ‘n’ unique non-negative integers.
 * Find the second largest and second smallest element from the array.
 * Return the two elements (second largest and second smallest) as another array of size 2.
 */

public class SecondOrderedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int secondOrderElementsArray[] = getSecondOrderElements(n, arr);
		System.out.println("Second largest element : " + secondOrderElementsArray[0] + " , Second smallest element : "
				+ secondOrderElementsArray[1]);

	}

	public static int[] getSecondOrderElements(int n, int[] arr) {
		int secondLargest = getSecondLargest(n, arr);
		int secondSmallest = getSecondSmallest(secondLargest, arr);
		return new int[] { secondLargest, secondSmallest };
	}

	public static int getSecondLargest(int n, int arr[]) {
		int secondLargest = -1;
		int largest = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] < largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

	public static int getSecondSmallest(int n, int arr[]) {
		int smallest = arr[0];
		int secondSmallest = Integer.MAX_VALUE;
		for (int i = 1; i < n; i++) {
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] != smallest && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
	}

}
