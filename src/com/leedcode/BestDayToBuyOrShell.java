package com.leedcode;

public class BestDayToBuyOrShell 
{

	static int maxProfit(int ans[])
	{
		int minPrice = ans[0];
		int maxProfit = 0;
		for(int i = 1;i<ans.length;i++)
		{
			if(minPrice>ans[i]) minPrice = ans[i];
			int res = ans[i]-minPrice;
			if(maxProfit<res) maxProfit=res;
		}
		return maxProfit;
	}
	public static void main(String[] args) 
	{
		int ans[]= {7,6,4,3,1};
		int profit = maxProfit(ans);
       System.out.println(profit);
	}

}
