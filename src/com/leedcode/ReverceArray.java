package com.leedcode;

public class ReverceArray
{

	static void printArray(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void swapInArray(int[]arr,int i ,int j)
	{
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void reverseArrayInlace(int[] arr)
	{
		int n= arr.length;
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			swapInArray(arr,i,j);
		}
		
	}
//	static int[] reverseArray(int[]arr)
//	{
//		int n=arr.length;
//		int ans[]=new int[n];
//		int j=0;
//		for(int i=n-1;i>=0;i--)
//		{
//			ans[j++]=arr[i];
//		}
//		return ans;
//	}
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6};
		//int[]ans = reverseArray(arr);
	    reverseArrayInlace(arr);
		printArray(arr);
	}

}
