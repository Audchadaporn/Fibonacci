package Fibonacci;

import java.util.Scanner;

public class FibonacciRecursion {
	
	// O(2^N)
	public static int fib(int i) {
		if(i < 2) return i;
		
		return fib(i-1) + fib(i-2);
	}
	
	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 0;
		while(i < n) {
			System.out.println(fib(i));
			i++;
		}
	}
}
