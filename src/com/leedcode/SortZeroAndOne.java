package com.leedcode;

public class SortZeroAndOne
{
	static void printArray(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void swapInArray(int[]arr,int i ,int j)
	{
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void sortZeroOne(int arr[])
	{
		int n = arr.length;
		int i = 0,j=n-1;
		while(i<j)
		{
			if(arr[i]==1&&arr[j]==0)
			{
				swapInArray(arr, i, j);
				i++;
				j--;
			}
			if(arr[i] ==0) i++;
			if(arr[j]==1) j--;
		}
		
	}
//	{
//		int count=0;
//		for(int i = 0;i<arr.length;i++)
//		{
//			if(arr[i]==0)
//				count++;
//		}
//		for(int i =0;i<arr.length;i++)
//		{
//			if(i<count)
//			{
//				arr[i]=0;
//			}
//			else {
//				arr[i]=1;
//			}
//		}

	
	public static void main(String[] args)
	{
		int arr[]= {0,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,};
		sortZeroOne(arr);
		printArray(arr);
		

	}

}
