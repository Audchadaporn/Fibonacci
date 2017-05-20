package Fibonacci;

import java.util.Scanner;

public class FIbinacci {
	
	
//	public static int fibonacci(int n) {
//		if(n <= 1) return n;
//		return fibonacci(n-2) + fibonacci(n-1);
//	}
	
	static int n1 = 0;
	static int n2 = 1;
	
	public static int fibonacci(int n) {
		return n1 + n2;
	}
	
	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 0;
		while(i++ < n) {
			int nn = fibonacci(i);
			System.out.println(nn);
			n1 = n2;
			n2 = nn;
		}
	}
	
//	public static void main(String[] arg) {
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		int i = 0;
//		while(i++ < n) {
//			System.out.println(fibonacci(i));
//		}
//	}
}
