package com.Recursion;

import java.util.Scanner;

public class Recursion_3 
{
	static int sumInt(int n )
	{
		if(n<=9&&n>=0)
		    return n;
		int smallAns = sumInt(n/10);
		int ans = smallAns + n%10;
		return ans;
	}
	static int countNumberOfDigit(int n)
	{
		if(n>=0 && n<=9)
		{
			return 1;
		}
		int count = 1+countNumberOfDigit(n/10);
		return count;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		//System.out.println(sumInt(n));
        System.out.println(countNumberOfDigit(n));
	}

}
