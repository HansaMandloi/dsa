package com.leedcode;

public class MinValue {

	public static void main(String[] args)
	{
		int nums[]= {-3,2,-3,4,2};
		int min = 0;
		for(int i = 0;i<nums.length;i++)
		{
			if(nums[i]<min)
			{
				min = nums[i];
			}
		}
		System.out.println(Math.abs(min)+2);
	}

}
