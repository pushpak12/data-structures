package dsa.learning.arrays.easy;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * You are given a sorted integer array 'arr' of size 'n'.
 * You need to remove the duplicates from the array such that each element appears only once.
 * Return the length of this new array.
 */
public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

//		int uniqueElementsArray[] = removeDuplicateElements(n, arr);
//		for(int element : uniqueElementsArray) {
//			System.out.println(element);
//		}

		System.out.println("Unique array size : " + removeDuplicates(n, arr));
	}

	// Bruteforce approach
	public static int[] removeDuplicateElements(int n, int arr[]) {
		Set<Integer> uniqueElements = new TreeSet<Integer>();
		for (int i = 0; i < n; i++) {
			uniqueElements.add(arr[i]);
		}

		int index = 0;
		int uniqueArray[] = new int[n];
		for (Integer element : uniqueElements) {
			uniqueArray[index] = element;
			index++;
		}

		return uniqueArray;
	}

	/*
	 * 
	 * Problem 4 : Remove duplicates from a sorted array. Optimal solution which
	 * has, time complexity of O(n) and space complexity of O(1). Two-pointer
	 * approached is used in the solution.
	 */

	public static int removeDuplicates(int n, int arr[]) {
		int i = 0;
		for (int j = 1; j < n; j++) {
			if (arr[j] != arr[i]) {
				arr[i + 1] = arr[j];
				i++;
			}
		}
		return i + 1;
	}
}
