package com.Recursion;

import java.util.Scanner;

public class Recursion_6 
{
	static int seriesSum(int n)   //1+2+3+4+5.....n
	{
		if(n==0) return 0;
		return seriesSum(n-1)+n;
	}
	static int seriesSum2(int n)   //1-2+3-4+5.......n
	{
		if(n==0) return 0;
		if(n%2==0) return seriesSum2(n-1)-n;
		else return seriesSum2(n-1)+n;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println(seriesSum2(n));  
        

	}

}
