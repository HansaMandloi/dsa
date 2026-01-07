package com.leedcode;

import java.util.Scanner;

public class RotateArray {

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
	static int[] RotateKtime(int[] arr,int k)
	{
		int n = arr.length;
		 k = k % n;
		 int j = 0;
		 int ans[]=new int[n];
		 for(int i = n-k;i<n;i++)
		 {
			ans[j++] = arr[i];
		 }
		 for(int i = 0 ;i<n-k;i++)
		 {
			 ans[j++]=arr[i];
		 }
		 return ans;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[]= {1,2,3,4,5};
		System.out.println("Number of rotate: ");
		int k = sc.nextInt();
		 int []ans = RotateKtime(arr, k);
        printArray(ans);
	}

}
