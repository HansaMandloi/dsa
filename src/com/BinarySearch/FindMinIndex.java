package com.BinarySearch;

public class FindMinIndex {
	
	static int findIndex(int arr[])
	{
		int st = 0,ans = 0;
		int n = arr.length-1;
		int end = n-1;
		while(st<=end)
		{
			int mid = st+(end-st)/2;
			if(arr[mid]>arr[n-1])
			{
				st = mid + 1;
			}
			else if(arr[mid]<=arr[n-1])
			{
				ans = mid;
				end = mid-1;
				
			}
		}
		return ans;
	}

	public static void main(String[] args)
	{
		int arr[] = {10,11,12,1,2,3,4,5,6,7,8,9};
		System.out.println(findIndex(arr));

	}

}
