package dsa.learning.arrays.easy;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.
 */
public class LeftRoatateArrayByNumberOfRotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter number of rotations : ");
		int d = sc.nextInt();
		int leftRotatedArray[] = rotateArrayUsingReverse(arr, n, d);
		for (int element : leftRotatedArray) {
			System.out.print(element + " ");
		}

//		System.out.println("Enter no. of rotations : ");
//		int k = sc.nextInt();
//		ArrayList<Integer> resultList = rotateArray(list, k);
//		for(Integer i : resultList)
//		{
//			System.out.print(i);
//		}

	}

	// Problem 6 : Left Rotate an Array by 'd' rotations

	public static int[] leftRotateArray(int n, int arr[], int d) {

		d = d % n;
		int temp[] = new int[d];
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}

		for (int i = d; i < n; i++) {
			arr[i - d] = arr[i];
		}

		for (int i = n - d; i < n; i++) {
			arr[i] = temp[i - (n - d)];
		}
		return arr;
	}

	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
		int n = arr.size();
		k = k % n;
		int temp[] = new int[k];
		for (int i = 0; i < k; i++) {
			temp[i] = arr.get(i);
		}

		for (int i = k; i < n; i++) {
			arr.set(i - k, arr.get(i));
		}
		for (int i = n - k; i < n; i++) {
			arr.set(i, temp[i - (n - k)]);
		}
		return arr;
	}

	// Problem 6 : Rotate an array by 'd' rotations.
	// Optimal solution using reverse.
	public static int[] rotateArrayUsingReverse(int arr[], int n, int k) {
		k = k % n;
		reverseArray(arr, 0, k - 1);
		reverseArray(arr, k, n - 1);
		reverseArray(arr, 0, n - 1);
		return arr;
	}

	public static void reverseArray(int arr[], int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
