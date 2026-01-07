package com.sorting;

public class SelectionSort 
{

	static void selection(int arr[])
	{
		
		int n = arr.length;
		for(int j = 0;j<n-1;j++)
		{
			int min_index = j;
		  for(int i = j+1;i<n;i++)
		  {
				if(arr[i]<arr[min_index])
				{
					min_index = i;
				}
		  }
		  if(min_index!=arr[j])
		  {
		    int temp = arr[j];
			arr[j]=arr[min_index];
			arr[min_index]=temp;
		  }
		}	
		
	}
	public static void main(String[] args) 
	{
		int arr[]= {2,4,3,3,7,32,2,21,4,5,0};
	    selection(arr);
	    for(int i = 0;i<arr.length;i++)
	    {
	    	System.out.println(arr[i]+" ");
	    }
		

	}

}
