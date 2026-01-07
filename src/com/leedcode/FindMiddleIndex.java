package com.leedcode;

public class FindMiddleIndex
{
	static int middleIndex(int []nums)
	{
		    int n = nums.length;
	        int sum = 0;
	       
	        if(n<=1)
	        {
	        	return 0;
	        }
	        
	        
	        
	        int pref[]=new int[n];
			pref[0]=nums[0];
			for(int i=1;i<n;i++)
			{
				pref[i]=pref[i-1]+nums[i];
			}
			
			for(int i = 0;i<n;i++)
			{
				System.out.print(pref[i]+" ");
			}
			
		    for(int i = 0;i<n;i++)
		        {
		        	sum+=nums[i];
		        }
		        
		        for(int i = 1;i<n;i++)
		        {
		        	if(pref[i-1] == sum - pref[i])
		        	{
		        		return i;
		        	}
		        }
		        return -1;
            
	}

	public static void main(String[] args) 
	{
		int arr[] = {1};
		System.out.println(middleIndex(arr));

	}

}
