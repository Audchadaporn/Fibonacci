package Fibonacci;

import java.util.Scanner;

public class FibonacciMatrix {

	
	static int fib(int num) {
		int M[][] = new int[][]{{1, 1}, {1, 0}};
		
		
		
		return M[0][0];
	}
	
	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();	// the number of sequence of fib numbers
		int i = 0;
		while(i++ < num) {
			System.out.println(fib(num));
		}
		 
	}
}
