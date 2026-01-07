package com.BinarySearch;

public class FirstOccurenceOfElement {

	static int firstOccurence(int arr[],int target)
	{
		int n = arr.length;
		int st = 0,end = n-1;
		int fo = -1;
		while(st <= end)
		{
			int mid = st + ((end-st)/2);
			if(arr[mid]==target)
			{
				fo = mid;
				end = mid-1;
			}
			else if(target<arr[mid])
			{
				end = mid-1;
			}
			else 
			{
				st = mid+1;
			}
		}
		return fo;
				
	}
	public static void main(String[] args) 
	{
		int arr[] = {5,5,5,5,5,6,7};
		int target = 5;
		System.out.println(firstOccurence(arr, target));

	}

}
