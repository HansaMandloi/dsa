package com.leedcode;

public class CountDigit {

	public static void main(String[] args) 
	{
//		int nums[] = {12,345,2,6,7896};
//		int n = nums.length;
//	       int ans = 0;
//	       for(int i = 0;i<n;i++)
//	       {
//	        int count = 0;
//	        while(nums[i]>=0)
//	         {
//	         int a = nums[i]%10;
//	         count++;
//	        
//	         nums[i] /=10;
//	         }
//	         if(count%2==0)
//	         {
//	           ans++;
//	         }
//
//	       } 
//	       System.out.println(ans);
		String nums1 = "2";
		String nums2 = "3";
		 long str1 = Long.parseLong(nums1);
	       long str2 = Long.parseLong(nums2);
	       long ans = str1*str2;
	       String ans1 = String.valueOf(ans);
	       System.out.println(ans1);
	}

}
