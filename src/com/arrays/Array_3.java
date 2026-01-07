package com.arrays;

import java.util.Scanner;

public class Array_3 
{
	static int lastOccurence(int arr[],int x)
	{
		int lastIndex = -1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				lastIndex=i;
			}
		}
		return lastIndex;
	}

	static int countOccurence(int arr[],int x)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		int arr[]= {4,5,6,5,6,7,5,5,5};
		int x=5;
		Array_3 ar = new Array_3();
		
		System.out.println("Count of x:"+countOccurence(arr, x));
		System.out.println("Last Occurence :"+lastOccurence(arr, x));

	}

}
