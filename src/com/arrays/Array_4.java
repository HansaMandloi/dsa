package com.arrays;

import java.util.Arrays;

public class Array_4 
{
	static int[] smallestAndlargestElemnts(int[]arr)
	{
		Arrays.sort(arr);
		int[] ans = {arr[0],arr[arr.length-1]};
		return ans;
	}
	static boolean sortArray(int arr[])
	{
		Boolean flag=true;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]<arr[i]) flag = true;
			else  return  flag=false;
		}
		return flag;
	}

	public static void main(String[] args)
	{
		int arr[]= {2,3,4,5,6};
		//System.out.println("Is Sorted:"+sortArray(arr));
		int brr[]= {4,5,6,2,4,5,9};
		System.out.println("Is Sorted:"+sortArray(brr));
		int[] ans = smallestAndlargestElemnts(arr);
		System.out.println(ans[0]);
		System.out.println(ans[1]);
	}
}
