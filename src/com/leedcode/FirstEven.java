package com.leedcode;

public class FirstEven 
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
	static void FirstEvenThanOdd(int[]arr)
	{
		int n = arr.length;
		int i =0,j=n-1;
		while(i<j)
		{
			if(arr[i]%2!=0 && arr[j]%2==0)
			{
				swapInArray(arr, i, j);
				i++;
				j--;
			}
			if(arr[i]%2==0) i++;
			if(arr[j]%2!=0) j--;
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6,7,8};
		FirstEvenThanOdd(arr);
        printArray(arr);
	}

}
