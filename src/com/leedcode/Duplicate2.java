package com.leedcode;

public class Duplicate2 
{
	static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int n = nums.length;
        int j = 1;
        for(int i = 0;i<n-1&&j<n;i++,j++)
        {
            if(i!=j)
            {
               if(Math.abs(i-j) <= indexDiff)
               {
                 if(Math.abs(nums[i] - nums[j]) <= valueDiff)
                 {
                    return true;
                 }
               }
               else{
            	   
                  continue;
               }
            }
        }
        return false;
    }

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,1};
		System.out.println(containsNearbyAlmostDuplicate(arr, 0, 3));

	}

}
