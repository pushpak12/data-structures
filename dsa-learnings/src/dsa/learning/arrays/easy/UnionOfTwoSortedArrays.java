package dsa.learning.arrays.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UnionOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of 1st array");
		int n1 = sc.nextInt();
		System.out.println("Enter size of 2nd array");
		int n2 = sc.nextInt();

		int arr1[] = new int[n1];
		System.out.println("Enter element in 1st array");
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}

		int arr2[] = new int[n2];
		System.out.println("Enter element in 2nd array");
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
		}

		System.out.println(unionOfTwoArraysBruteforceApproach(arr1, arr2));

	}

	public static List<Integer> unionOfTwoArraysBruteforceApproach(int[] arr1, int arr2[]) {
		Set<Integer> sortedSet = new HashSet<Integer>();
		List<Integer> unionList = new ArrayList<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			sortedSet.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			sortedSet.add(arr2[i]);
		}

		for (Integer s : sortedSet) {
			unionList.add(s);
		}
		return unionList;
	}
}
