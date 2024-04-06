package dsa.learning.arrays.easy;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		System.out.println(num+" occurs at "+ linearSearch(n, num, arr)+" index in the given array");
		
	}

	public static int linearSearch(int n, int num, int []arr) {
		for(int i = 0; i < n; i++) {
			if(arr[i] == num) {
				return i;
			}
		}
		return -1;
	}
}
