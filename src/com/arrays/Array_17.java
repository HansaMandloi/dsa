package com.arrays;
//Sort Array of 0 and 1
public class Array_17
{
	static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
    static void countZero(int arr[])
    {
    	int count=0;
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]==0)
        	{
        		count++;
        	}
        }
        for(int i=0;i<arr.length;i++)
        {
        	if(i<count) arr[i]=0;
        	else arr[i]=1;
        }
        
       
    }
	public static void main(String[] args) 
	{
        int arr[]= {0,1,0,1,0,0,1,1,0};
        System.out.print("Original Value :-");
        printArray(arr);
        countZero(arr);
        System.out.print("Sorted  Array :- ");
        printArray(arr);
	}

}
