package dsa.learning.arrays.easy;

import java.util.Scanner;

/*
 * Check if given array is sorted or not
 */
public class IsArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Is the given array sorted : " + isSorted(n, arr));
	}

	public static boolean isSorted(int n, int arr[]) {
		for (int i = 1; i < n; i++) {
			if (arr[i] >= arr[i - 1]) {

			} else {
				return false;
			}
		}
		return true;
	}

}
