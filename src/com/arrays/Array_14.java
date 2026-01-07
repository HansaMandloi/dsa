package com.arrays;

import java.util.Scanner;

public class Array_14 
{

	static int[] rotate(int []arr,int k)
	{
		int n=arr.length;
		k=k%n;
		int []ans = new int[n];
		int j=0;
		
		for(int i=n-k;i<n;i++)
		{
			ans[j++]=arr[i];
		}
		
		for(int i=0;i<n-k;i++)
		{
			ans[j++] = arr[i];
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n= sc.nextInt();
		int []arr= new int[n];
		
		System.out.println("Enter "+n+" elements :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter k :");
		int k= sc.nextInt();
		
		System.out.println("Original Array :");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		int []ans = rotate(arr, k);
		System.out.println();
		System.out.println("Array after rotation :");
		for(int i=0;i<n;i++)
		{
			System.out.print(ans[i]+" ");
		}
		

	}

}
