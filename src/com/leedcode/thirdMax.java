package com.leedcode;

public class thirdMax 
{
	
	    public int firstMax(int[]arr)
	    {
//	        int max = Integer.MIN_VALUE;
//	        for(int i = 0 ;i<nums.length;i++){
//	            if(nums[i]>max)
//	            {
//	                max=nums[i];
//	            }
//	        }
//	        return max;
	    	int max = firstMax(arr);
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==max)
				{
					arr[i] = Integer.MIN_VALUE;
				}
			}
          return max;
	    }
	    int secondMax(int []arr)
	    {
//	        int max = firstMax(nums);
//	        for(int i = 0;i<nums.length;i++)
//	        {
//	            if(nums[i]==max)
//	            {
//	               nums[i] = Integer.MIN_VALUE;
//	            }
//	        }
//	        int secondMax = firstMax(nums);
//	        return secondMax;
	    	int max = firstMax(arr);
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==max)
				{
					arr[i] = Integer.MIN_VALUE;
				}
			}
			int secondMax=firstMax(arr);
			return secondMax;
	    }
	    public int thirdMax(int[] arr) 
	    {
//	        int max = firstMax(nums);
//	        int secondMax = secondMax(nums);
//	        for(int i = 0; i<nums.length;i++)
//	        {
//	           if(nums[i]==max && nums[i]==secondMax)
//	           {
//	            nums[i]=Integer.MIN_VALUE;
//	           }
//	        }
//	        int thirdMax = firstMax(nums);
//	        return thirdMax;
	    	int max = firstMax(arr);
			int thirdValue = secondMax(arr);
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==thirdValue&&arr[i]==max)
				{
					arr[i]=Integer.MIN_VALUE;
				}
			}
			int thirdMaxValue = firstMax(arr);
			return thirdMaxValue;
	    }
	
	public static void main(String[] args)
	{
		int[]arr = {1,2,3,4,5,6};
		thirdMax tm = new thirdMax();
		int r=tm.thirdMax(arr);
		System.out.println(r);
	}

}
