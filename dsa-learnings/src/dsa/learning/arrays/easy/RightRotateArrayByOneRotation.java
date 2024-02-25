package dsa.learning.arrays.easy;

import java.util.Scanner;

public class RightRotateArrayByOneRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int rightRotatedArrayByOne[] = rightRoatateArrayByOne(n, arr);
		for (int element : rightRotatedArrayByOne) {
			System.out.print(element + " ");
		}

	}

	public static int[] rightRoatateArrayByOne(int n, int arr[]) {
		int temp = arr[n - 1];
		for (int i = n - 1; i >= 1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
		return arr;
	}

}
