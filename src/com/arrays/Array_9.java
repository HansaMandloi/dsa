package com.arrays;

public class Array_9
{
    static int firstRepeatValue(int arr[])
    {
    	int ans=-1;
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    			if(arr[i]==arr[j])
    			{
    				
    				return arr[i];
    			}
    		}
    	}
    	return -1;
    	
    }
	public static void main(String[] args) 
	{
		int arr[]= {1,5,3,4,6,3,4};
		System.out.println(firstRepeatValue(arr));

	}

}
