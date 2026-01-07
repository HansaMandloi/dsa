package com.arrays;

import java.util.Scanner;

public class ArraySuffixSum
{
	static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static int findArraySum(int arr[])
	{
		int totalSum =0;
		for(int i=0;i<arr.length;i++)
		{
			totalSum+=arr[i];
		}
		return totalSum;
	}
	
	static boolean equalSumPartition(int[] arr)
	{
		int totalSum = findArraySum(arr);
		int prefSum = 0;
		for(int i=0;i<arr.length;i++)
		{
			prefSum += arr[i];
			int suffixSum = totalSum - prefSum;
			if(suffixSum == prefSum)
			{
				return true;
			}
		}
		return false;
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
		equalSumPartition(arr);
        System.out.println("Equal Partition Of Array : "+equalSumPartition(arr));
	}

}
