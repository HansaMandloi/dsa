package com.Recursion;

import java.util.Scanner;

public class Recursion_1 
{
	//Recursion :- A function calling itself with different parameters 
	//and a base case to terminate the infinite loop 
	
	//* In recursion ,we solve a bigger problem by solving smaller subproblems
	

	static void print()
	{
		System.out.println("hello");
	}
	
	static void printIncreasing (int n)
	{
		if(n==1) {
			System.out.print(1);
			return;
		}
		printIncreasing(n-1);
	    System.out.print(" "+n);
	}
	
	static void printDecreasing(int n)
	{
		if(n==1)
		{
			System.out.print(1);
			return;
		}
		System.out.print(n+" ");
		printDecreasing(n-1);
		
	}
	
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
     print();
     System.out.println("Enter Number :");
     int n = sc.nextInt();
     printIncreasing(n);
     System.out.println();
     printDecreasing(n);
     

	}

}
