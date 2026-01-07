package com.arrays;

public class Array_12
{

	static void reverseArray(int arr[])
	{
		int n=arr.length;
		int ans[]=new int[n];
		
		System.out.println("Original Array :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int j=0;
		for(int i=n-1;i>=0;i--)
		{
			ans[j++]=arr[i];
		}
		System.out.println();
		System.out.println("After Reverse :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
		
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		reverseArray(arr);

	}

}
