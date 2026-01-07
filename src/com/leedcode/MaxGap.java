package com.leedcode;

import java.util.Arrays;

public class MaxGap {
	static int maximumGap(int[] nums) 
    {
        int n = nums.length;
        int maxgap = 0;
        if(n<2)
        {
            return 0;
        }
        Arrays.sort(nums);
        for(int i = 1;i<n;i++)
        {
            if((nums[i]-nums[i-1])>maxgap)
            {
                maxgap = nums[i]-nums[i-1];
            }
        }
        return maxgap;
        
    }

	public static void main(String[] args) 
	{
		int arr[]= {1,1,1,1,1,1,1,5,5,5,5,5,5};
		int ans = maximumGap(arr);
		System.out.println(ans);
		

	}

}
