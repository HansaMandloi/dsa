package com.TwoDArray;

import java.util.Scanner;
  //90* roatate matrix;
public class RotateMatrix_Array
{
	static void printArray(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void reverseArray(int arr[])
	{
		int n=arr.length;
		int i=0,j=n-1;
		while(i<j)
		{
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}
	static void transposeMatrix(int arr[][],int r,int c)
	{
		
		
		for(int i = 0;i<c;i++)
		{
			for(int j =i;j<r;j++)
			{
			   //swap matrix[i][j]
				int temp = arr[i][j];  //Only for squre matrix
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		System.out.println("Transport Matrix");
		printArray(arr);
	}
	
	static void RotateMatrix(int arr[][],int r)
	{
		transposeMatrix(arr, r, r);
		
		for(int i = 0;i<r;i++)
		{
			reverseArray(arr[i]);
		}
	   
	}
	
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
			
			
			System.out.print("Enter number of rows :");
			int r = sc.nextInt();
			
			System.out.print("Enter number of columns :");
			int c = sc.nextInt();
			
			int arr[][]=new int [r][c]; //Total Elements = r*c
			
			System.out.println("Enter "+r*c+" Elements");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					arr[i][j] = sc.nextInt();
				}
				System.out.println();
			}
			System.out.println("Input Matrix");
			printArray(arr);
	        RotateMatrix(arr, r);
	       
	        System.out.println("Rotate Matrix");
	 	   printArray(arr);	
	        
	}
	

}
