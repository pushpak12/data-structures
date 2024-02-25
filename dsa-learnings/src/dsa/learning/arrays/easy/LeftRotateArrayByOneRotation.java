package dsa.learning.arrays.easy;

import java.util.Scanner;

/*
 * Given an array 'arr' containing 'n' elements, rotate this array left once and return it.
 * Rotating the array left by one means shifting all elements by one place to the left and moving the first element to the last position in the array.
 */

public class LeftRotateArrayByOneRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public static int[] leftRotateArraybyOne(int n, int arr[]) {
		int temp = arr[0];
		for (int i = 1; i < n; i++) {
			arr[i - 1] = arr[i];
		}
		arr[n - 1] = temp;
		return arr;
	}

}
