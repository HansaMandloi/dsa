package com.Recursion;

import java.util.Scanner;

public class Recursion_5
{

	static void multiplesOfNum(int n,int k) //(4,3) = 4 8 12
	{
		if(k==1)
		{
			System.out.println(n);
			return;
		}
	    multiplesOfNum(n, k-1);
	    System.out.println(n*k);
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int k = sc.nextInt();
        multiplesOfNum(n, k);

	}

}
