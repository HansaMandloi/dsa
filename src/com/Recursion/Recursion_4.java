package com.Recursion;

import java.util.Scanner;

public class Recursion_4 
{
	static double power(int p,int q)  //p^q
	{
		if(q==0) return 1;
		return power(p, q-1)*p;
	}
	static double power2(int p ,int q)
	{
		if(q==0) return 1;
		double smallPow = power(p, q/2);
		if(q%2==0)
		{
			return smallPow*smallPow;
		}
		return p*smallPow*smallPow;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int p = sc.nextInt();
		int q = sc.nextInt();
        System.out.println(power(p, q));
	}

}
