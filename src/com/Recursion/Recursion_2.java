package com.Recursion;

import java.util.Scanner;

public class Recursion_2 {
	// f(n) = n * f(n-1); - Recurrence relation
	static int factorial(int n) {
		if (n == 0) // Base Case
		{
			return 1;
		}
		//int smallAns = factorial(n - 1); // Smaller Problem - recurssive work

		// int ans = n*smallAns;
		return n * factorial(n - 1); // big problem - self work
	}
	static int fabonacciTerm(int n)
	{
		if(n==0) return 0;
		if(n==1) return 1;
		
//		int prev = fabonacciTerm(n-1);
//		int preprev = fabonacciTerm(n-1);
//		return prev+preprev;
		
		return fabonacciTerm(n-1)+fabonacciTerm(n-2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println(factorial(n));
        int ans = fabonacciTerm(n);
        System.out.println(ans);
	}

}
