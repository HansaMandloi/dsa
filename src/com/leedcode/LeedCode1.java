package com.leedcode;

public class LeedCode1
{
	
	public void rotate(int[] nums, int k) 
    {
        int n=nums.length;
        int[]ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++)
        {
          ans[j++]=nums[i];
        }
        for(int i=0;i<n-k;i++)
        {
          ans[j++]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
          System.out.print(ans[i]+" ");
        }

        
    }
	
	public static void main(String[] args) 
	{
		int nums[]= {1,2,3,4,5};
		int k=2;
		LeedCode1 s =new LeedCode1();
		//s.removeDuplicates(nums);
		s.rotate(nums, k);
       
	}

}
