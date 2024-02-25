package dsa.learning.arrays;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ArrayEasyExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Largest element in an array : "+ largestElementInArray(arr, n));
		
		int secondOrderElementsArray[] = getSecondOrderElements(n, arr);
		System.out.println("Second order elements in an array : "+ secondOrderElementsArray[0] + " , "+secondOrderElementsArray[1]);
		
		System.out.println("Is the given array sorted : "+ isSorted(n, arr));
		
		int uniqueElementsArray[] = removeDuplicateElements(n, arr);
		for(int element : uniqueElementsArray) {
			System.out.println(element);
		}
		
		System.out.println("Unique array size : "+removeDuplicates(n, arr));
	}
	
	// Problem 1 : Find largest element in an array
	public static int largestElementInArray(int[] arr, int n) {
		
		int largest = arr[0];
		for(int i = 1; i < n; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
	
	// Problem 2 : Find second largest and smallest element in an array
	public static int[] getSecondOrderElements(int n, int[] arr) {
		int secondLargest = getSecondLargest(n, arr);
		int secondSmallest = getSecondSmallest(secondLargest, arr);
		return new int[] {secondLargest, secondSmallest};
	}
	
	public static int getSecondLargest(int n, int arr[]) {
		int secondLargest = -1;
		int largest = arr[0];
		for(int i = 1; i < n; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}else if(arr[i] < largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}
	
	public static int getSecondSmallest(int n, int arr[]) {
		int smallest = arr[0];
		int secondSmallest = Integer.MAX_VALUE;
		for(int i = 1; i < n; i++) {
			if(arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}else if(arr[i] != smallest && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
	}
	
	// Problem 3 : Check if the array is sorted (non-decreasing order)
	public static boolean isSorted(int n, int arr[]) {
		for(int i = 1; i < n; i++) {
			if(arr[i] >= arr[i-1]) {
				
			}else {
				return false;
			}
		}
		return true;
	}
	
	// Problem 4 : Remove duplicate elements from a sorted array
	public static int[] removeDuplicateElements(int n, int arr[]) {
		Set<Integer> uniqueElements = new TreeSet<Integer>();
		for(int i = 0; i < n; i++) {
			uniqueElements.add(arr[i]);
		}
		
		int index = 0;
		int uniqueArray[] = new int[n];
		for(Integer element : uniqueElements) {
			uniqueArray[index] = element;
			index++;
		}
		
		return uniqueArray;
	}
	
	/*
	 * 
	 *  Problem 4 : Remove duplicates from a sorted array.
	 *  Optimal solution which has, time complexity of O(n) and space complexity of O(1).
	 *  Two-pointer approached is used in the solution.
	 */
	
	public static int removeDuplicates(int n, int arr[]) {
		int i = 0;
		for(int j = 1; j < n; j++) {
			if(arr[j] != arr[i]) {
				arr[i+1] = arr[j];
				i++;
			}
		}
		return i + 1;
	}
	

}
