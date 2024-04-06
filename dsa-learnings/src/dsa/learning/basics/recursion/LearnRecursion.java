package dsa.learning.basics.recursion;

import java.util.Scanner;

public class LearnRecursion {

	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
//		count();
		
		
//		System.out.println("Enter how many times you want to print your name");
//		int n = sc.nextInt();
//		printName(1, n);
		
//		System.out.println("Enter range of numbers you want to print");
//		int n = sc.nextInt();
//		printNumbers(1, n);
		
//		System.out.println("Enter range of numbers you want to print till 1");
//		int n = sc.nextInt();
//		printNumbersTill1(n, n);
		
//		System.out.println("Enter range of natural numbers you want to sum");
//		int n = sc.nextInt();
//		sumOfAllNaturalNumbers(n, 0);
		
		System.out.println("Enter number");
		int n = sc.nextInt();
		factorialOfNumber(n, 1);
		
		
	}
	
	// Print numbers till count is 3
	static int count = 0;
	public static void count() {
		if(count == 3) return;
		System.out.println(count);
		count++;
		count();
	}
	
	// Print Name N times using Recursion
	public static void printName(int i, int n) {
		if(i>n) return;
		System.out.println("Pushpak");
		printName(i+1, n);
	}
	
	// Print 1 to N using Recursion
	public static void printNumbers(int i, int n) {
		if(i > n) return;
		System.out.println(i);
		printNumbers(i+1, n);
	}
	
	// Print N to 1 using Recursion
	public static void printNumbersTill1(int i, int n) {
		if(i<1) return;
		System.out.println(i);
		printNumbersTill1(i-1, n);
	}

	// Sum of first N Natural Numbers
	public static void sumOfAllNaturalNumbers(int i, int sum) {
		if(i<1) {
			System.out.println(sum);
			return;
		}
		
		sumOfAllNaturalNumbers(i-1, sum+i);
		
		System.out.println();
	}

	public static void factorialOfNumber(int i, int factorial) {
		if(i < 1)
		{
			System.out.println(factorial);
			return;
		}
		factorialOfNumber(i-1,factorial*i);
	}
}
