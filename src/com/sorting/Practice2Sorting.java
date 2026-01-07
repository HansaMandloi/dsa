package com.sorting;

public class Practice2Sorting {

	static void partition(int nums[])
	{
		int l = 0,r = nums.length-1;
		while(l<r)
		{
			while(nums[l] < 0) l++;
			while(nums[r] >= 0) r--;
			if(l<r)
			{
				int temp = nums[l];
				nums[l] = nums[r];
				nums[r] = temp;
				l++;
				r--;
			}
		}
	}
	public static void main(String[] args)
	{
		
		int nums[] = {-5,-20,7,-4,-13,11,19,2};
		partition(nums);
		for(int value:nums)
        {
        	System.out.print(value+" ");
        }
	}

}
