package com.arrays;

import java.util.Scanner;
  //Rotate without using new Array;
public class Array_15
{
	static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void swapInArray(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	static void reverseArray(int arr[],int i,int j)
	{
		
		while(i<j)
		{
			swapInArray(arr,i,j);
			i++;
			j--;
		}
	}
	static int[] rotate(int []arr,int k)
	{
		int n=arr.length;
		k=k%n;
		
		reverseArray(arr,0,n-k-1);  //5-2-1=2;0 to 2; {3,2,1,4,5}
        reverseArray(arr, n-k,n-1);  //5-2=3; 3 to 4; {3,2,1,5,4};
        reverseArray(arr,0,n-1);     //   0 to 4;   {4,5,1,2,3};

		return arr;
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		printArray(arr);
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		rotate(arr, k);
		printArray(arr);

	}

}
