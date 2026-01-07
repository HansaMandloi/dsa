package com.BinarySearch;

public class SqureRoot {

	static int sqRt(int n)
	{
		int st = 0,end = n;
		int ans = -1;
		while(st<=end)
		{
			int mid = st + ((end-st)/2);
			int val = mid*mid;
			if(val==n)
			{
				return mid;
			}
			else if(val < n)
			{
				ans = mid;
				st = mid+1;
			}
			else
			{
				end = mid -1;
			}
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		int n = 26;
		System.out.println(sqRt(n));

	}

}
