package com.sorting;

public class CountSort 
{

	static int findMax(int arr[])
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
    static void basicCountSort(int arr[])
    {
    	int max = findMax(arr);
    	int []count = new int[max+1];
    	for(int i = 0;i<arr.length;i++)
    	{
    		count[arr[i]]++;
    	}
    	int k = 0;
    	for(int i = 0;i<count.length;i++)
    	{
    		for(int j = 0;j<count[i];j++)
    		{
    			arr[k++] = i;
    		}
    	}
    }
	static void display(int arr[])
	{
		for(int i  =0 ;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,4,5,2,2,5};
		basicCountSort(arr);
		display(arr);
		

	}

}
