package dsa.learning.arrays.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Move Zero's to End
 * Problem statement:
 * Given an array 'arr' of 'n' non-negative integers, your task is to move all the zeros to the end of the array while keeping the non-zero elements at the start of the array in their original order. Return the modified array.
 */

public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

//		int movedZerosArray[] = moveZeros(arr, n);
		int movedZerosArray[] = moveZerosOptimal(arr, n);
		for (int i : movedZerosArray) {
			System.out.print(i + " ");
		}
	}

	public static int[] moveZeros(int arr[], int n) {
		List<Integer> temp = new ArrayList<Integer>();

		// Non-zero elements in temp array
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				temp.add(arr[i]);
			}
		}
		for (int i = 0; i < temp.size(); i++) {
			arr[i] = temp.get(i);
		}
		for (int i = temp.size(); i < n; i++) {
			arr[i] = 0;
		}
		return arr;
	}

	public static int[] moveZerosOptimal(int arr[], int n) {
		int j = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				j = i;
				break;
			}
		}
		for (int i = j; i < n; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		return arr;
	}
}
