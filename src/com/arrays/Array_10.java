package com.arrays;

import java.util.Scanner;

public class Array_10 
{

	static void swap(int x,int y)
	{
		int temp;
		System.out.println("Original value :");
		System.out.println("a:"+x);
		System.out.println("b:"+y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After swappping :");
		System.out.println("a:"+x);
		System.out.println("b:"+y);
	}
	public static void main(String[] args) 
	{
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values :");
		x=sc.nextInt();
		y=sc.nextInt();
		swap(x,y);

	}

}
