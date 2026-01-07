package com.leedcode;

public class FirstAndLastOccurence
{
	static int[] FirstAndLastIndex(int nums[],int target)
	{
		
		int firstIndex = -1;
		int lastIndex = -1;
		
		for(int i = 0 ;i<nums.length;i++)
		{
			if(nums[i]==target) 
			{
				if(firstIndex==-1)
				{
					firstIndex=i;
				}
				lastIndex=i;
			}
		}
		return new int[] {firstIndex,lastIndex};
		
	}

	public static void main(String[] args)
	{
		int nums[]= {1,2,3,8,8,2};
		int num2[]= {1,2,8,4,9};
		int num3[]= {3,3,3};
		int target=3;
		int ans[]=FirstAndLastIndex(num3, target);
		for(int i=0;i<ans.length;i++)
		{
        System.out.print(ans[i]+" ");
		}
	}

}
