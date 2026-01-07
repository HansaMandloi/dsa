package com.arrays;

//find second large value in array elements

public class Array_8
{

	static int findMax(int arr[])
	{
		int n=arr.length;
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];	
			}
			
		}
		return max;
	}
	static int findSecondMax(int[]arr)
	{
		int max = findMax(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==max)
			{
				arr[i] = Integer.MIN_VALUE;
			}
		}
		int secondMax=findMax(arr);
		return secondMax;
	}
	static int thirdMax(int[]arr)
	{
		int max = findMax(arr);
		int thirdValue = findSecondMax(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==thirdValue&&arr[i]==max)
			{
				arr[i]=Integer.MIN_VALUE;
			}
		}
		int thirdMaxValue = findMax(arr);
		return thirdMaxValue;
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,6,7,8};
		System.out.println(findSecondMax(arr));
       System.out.println(thirdMax(arr));
	}

}
