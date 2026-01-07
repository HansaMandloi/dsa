package com.arrays;
import java.util.*;

public class SumOfArray 
{
	void searchElement()
	{
		int arr[]= {3,4,5,7,8};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number you want to search: ");
		int x =sc.nextInt();
		int ans=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				ans =i;
				break;
			}
			
		}
		if(ans==-1)System.out.println("Not Found ");
		else System.out.println("Found "+x+" at index "+ans);		
	}
	void maxNum()
	{
		int[]arr= {11,1,5,9,6};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Max = "+max);
	}
	
	void sumOfArray()
	{
		int[]arr= {3,5,6,8};
		int sum=0;
		for(int i=0;i<arr.length;i++)	
		{
		   sum=sum+arr[i];
		   
		}
		System.out.println("sum = "+sum);
	}

	public static void main(String[] args)
	{
		SumOfArray sa= new SumOfArray();
		sa.sumOfArray();
		sa.maxNum();
		sa.searchElement();
		

	}

}
