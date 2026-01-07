package com.sorting;

public class ProblemsOnSorting {

	static void sortArr(int[] nums)
	{
		int n= nums.length;
		int x = -1;
		int y = -1;
		
		if(n<=1) return;
		for(int i = 1;i<n;i++)
		{
			if(nums[i-1]>nums[i])
			{
			if(x==-1)
			{
				x = i-1;
				y = i;
			}
			else
			{
				y = i;
			}
		}
		}
		int temp = nums[x];
		nums[x]= nums[y];
		nums[y] = temp;
	}
	public static void main(String[] args) 
	{
		int[]nums = {10,5,6,7,8,9,3};
		sortArr(nums);
        for(int value:nums)
        {
        	System.out.print(value+" ");
        }
	}

}
