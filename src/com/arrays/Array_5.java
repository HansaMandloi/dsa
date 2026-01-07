package com.arrays;

//Find total number of pairs in thr Array whose sum is equal to the given value x;

public class Array_5
{
	static int pairSum(int arr[],int target)
	{
		int n=arr.length;
		int pair=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					pair++;
				}
			}
		}
		return pair;
	}

	public static void main(String[] args) 
	{
		int arr[] = {4,6,3,5,8,2};
		int target = 7;
		System.out.println(pairSum(arr, target));

	}

}
