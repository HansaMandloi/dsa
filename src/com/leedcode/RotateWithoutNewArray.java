package com.leedcode;

import java.util.Scanner;

public class RotateWithoutNewArray 
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
    static void ReverseArray(int[]arr,int i,int j)
    {
    	while(i<j)
    	{
    		swapInArray(arr,i,j);
    		i++;
    		j--;
    	}
    }
    static void RotateInPlace(int[]arr,int k)
    {
    	int n = arr.length;
    	k=k%n;
    	ReverseArray(arr, 0, n-k-1);
    	ReverseArray(arr, n-k, n-1);
    	ReverseArray(arr, 0, n-1);
    }
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rotate:");
        int k = sc.nextInt();
        RotateInPlace(arr, k);
        printArray(arr);
        
	}

}
