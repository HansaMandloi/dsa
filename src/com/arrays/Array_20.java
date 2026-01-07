package com.arrays;

import java.util.Scanner;

public class Array_20
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
	
	static int[] squreElements(int arr[])
	{
//		

		
		
		int n = arr.length;
		int left =0,right = n-1;
		int ans[] = new int[n];
		int k = 0;
		while(left<=right)
		{
		  if(Math.abs(arr[left]) > Math.abs(arr[right]))
		  {
			  ans[k++] = arr[left]*arr[left];
			  left++;
			 
		  } else {
			  ans[k++] = arr[right]*arr[right];
			  right--;
		  }
		  
		}
		reverseArray(arr);
		return ans;
		
	}
	static void reverseArray(int arr[])
	{
		int i=0,j=arr.length-1;
		while(i<j)
		{
			swapInArray(arr,i,j);
			i++;
			j--;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" Elements :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
        System.out.println("Original Array :");
        printArray(arr);
        int ans[] = squreElements(arr);
        System.out.println("Sorted Array :");
        reverseArray(ans);
        printArray(ans);
	}

}
