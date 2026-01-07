package com.leedcode;

import java.util.Scanner;

public class PrifixArraySumGivenIndex 
{
	static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static int[] prefixSumArray(int arr[])
	{
		int n = arr.length;
		for(int i=1;i<n;i++)
		{
			arr[i] = arr[i]+arr[i-1];
		}
		return arr;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" Elements :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Original Array :");
		printArray(arr);
		int[] prefSum = prefixSumArray(arr);
		
		System.out.println("Enter number of queries:");
		int q = sc.nextInt();
		while(q>0)
		{
			System.out.println("Enter Range");
			int l = sc.nextInt();
			int r = sc.nextInt();
			
			int ans = prefSum[r] - prefSum[l-1];
			System.out.println("Sum "+ans);
			
		}
		
	}


}
