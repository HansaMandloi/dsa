package com.Recursion;

public class Recursion_8
{

	static void printArray(int nums[],int idx)
	{
		;
		if(idx==nums.length)
		{
			return;
		}
		System.out.print(nums[idx]+" ");
		printArray(nums, ++idx);
		
	}
	static int maxValueOfArray(int nums[],int idx)
	{
		if(idx == nums.length-1)
		{
			return nums[idx];
		}
		int max = maxValueOfArray(nums, idx+1);
		 return Math.max(nums[idx], max);
		
	}
	static int sumOfArray(int nums[],int idx)
	{
		if(idx == nums.length-1)
		{
			return nums[idx];
		}
		int sum = sumOfArray(nums, idx+1);
		sum = nums[idx]+sum;
		return sum;
	}
	public static void main(String[] args)
	{
		int nums[]= {2,8,4,5,1};
		printArray(nums, 0);
		System.out.println();
		System.out.println(maxValueOfArray(nums, 0));
		System.out.println(sumOfArray(nums, 0));

	}

}
