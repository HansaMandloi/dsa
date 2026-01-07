package com.TwoDArray;

import java.util.Scanner;

public class transposeMatrixInPlace_Array 
{
	static void printArray(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
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
        transposeMatrix(arr, r, c);
        
        
	}

}
