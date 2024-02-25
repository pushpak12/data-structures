package dsa.learning.arrays.easy;

import java.util.Scanner;

public class RightRotateArrayByNumberOfRotation {

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
		int k = sc.nextInt();
		int rightRotatedArray[] = rightRotateArray(n, arr, k);
		for (int element : rightRotatedArray) {
			System.out.print(element + " ");
		}
	}

	public static int[] rightRotateArray(int n, int arr[], int k) {

		k = k % n;
		int temp[] = new int[k];
		for (int i = n - k; i < n; i++) {
			temp[i - n + k] = arr[i];
		}

		for (int i = n - k - 1; i >= 0; i--) {
			arr[i + k] = arr[i];
		}

		for (int i = 0; i < k; i++) {
			arr[i] = temp[i];
		}
		return arr;
	}

}
