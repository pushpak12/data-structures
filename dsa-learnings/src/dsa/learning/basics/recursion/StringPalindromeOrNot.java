package dsa.learning.basics.recursion;

import java.util.Scanner;

public class StringPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
//		System.out.println(stringPalindromeOrNot(str));
		System.out.println(checkStringPalindromeUsingRecusrion(str, 0));
		
	}
	
	// Approach 1 : Using while loop
	
	public static boolean stringPalindromeOrNot(String str) {
		int start = 0;
		int end = str.length()-1;
		while(start < end) {
			char l = str.charAt(start);
			char r = str.charAt(end);
			if(!Character.isLetterOrDigit(l)) {
				start++;
			}else if(!Character.isLetterOrDigit(r)) {
				end--;
			}else if(Character.toLowerCase(l) != Character.toLowerCase(r)) {
				return false;
			}else {
				start++;
				end--;
			}
		}
		return true;
	}

	// Approach 2 : Using recursion
	
	public static boolean checkStringPalindromeUsingRecusrion(String str, int i) {
		if(i >= (str.length()/2)) return true;
		if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
		return checkStringPalindromeUsingRecusrion(str, i+1);
	}
}
