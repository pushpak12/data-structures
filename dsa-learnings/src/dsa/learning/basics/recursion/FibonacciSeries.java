package dsa.learning.basics.recursion;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		fibonacciSeriesApproachOne(6);
		System.out.println(fibonnaciSeriesUsingRecursion(6));
	}
	
	public static void fibonacciSeriesApproachOne(int n) {
		int last = 1;
		int slast = 0;
		System.out.print(slast+" "+last+" ");
		int sum;
		for(int i = 2; i <= n; i++) {
			sum = slast + last;
			slast = last;
			last = sum;
			System.out.print(sum+" ");
		}
	}

	public static int fibonnaciSeriesUsingRecursion(int n) {
		if( n <= 1) {
			return n;
		}
		int last = fibonnaciSeriesUsingRecursion(n-1);
		int slast = fibonnaciSeriesUsingRecursion(n-2);
		return last + slast;
	}
	

}
