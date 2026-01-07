package com.leedcode;

public class Solution1 
{
	
    static void sortColors(int nums[])
    {
    	int zero = 0,one = 0,two = 0;
    	for(int i = 0;i<nums.length;i++)
    	{
    		if(nums[i]==0) zero++;
    		if(nums[i]==1) one++;
    		if(nums[i]==2) two++;
    	}
    	System.out.println();
    	System.out.println(zero);
    	System.out.println(one);
    	System.out.println(two);
    	for(int i = 0 ; i<zero;i++)
    	{
    		nums[i]=0;
    	}
    	int j = zero+one;
    	for(int i = zero ; i<j;i++)
    	{
    		nums[i]=1;
    	}
    	for(int i = zero+one ; i<nums.length;i++)
    	{
    		nums[i]=2;
    	}
    	System.out.println();
    	 for(int i = 0;i<nums.length;i++)
			{
				System.out.print(nums[i]+" ");
			}
    }
	public static void main(String[] args) 
	{
		int arr[]= {2,0,1};
		 for(int i = 0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
		sortColors(arr);
		

	}

}
