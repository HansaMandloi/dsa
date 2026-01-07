package com.Recursion;

public class Recursion_9
{
	static void LinearSearch(int []arr,int target,int idx)  //TC = O(n);
	{
		int n = arr.length-1;
		if(idx>n)
		{
			System.out.println("No");
			return;
		}
		if(target==arr[idx])
		{
			System.out.println("Yes");
			return;
		}
		LinearSearch(arr, target, ++idx);
		
		
	}
	static int SearchFirstIndex(int []arr,int target,int idx)  //TC = O(n);
	{
		int n = arr.length-1;
//		if(idx>n)
//		{
//			System.out.println("No");
//			return -1;
//		}
		if(target==arr[idx])
		{
			return idx;
		}
		 return SearchFirstIndex(arr, target, ++idx);
		
		
	}

	public static void main(String[] args) 
	{
		int nums[]= {2,3,4,5,6};
	  // LinearSearch(nums, 6, 0);
       int idx=SearchFirstIndex(nums, 4, 0);
       System.out.println(idx);
	}

}
