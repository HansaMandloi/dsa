package com.TwoDArray;

import java.util.Scanner;

public class TwoD_Array1 
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
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int brr[][]= {{1,2,3,4},{3,4,5,7},{3,5,6,9}};
		
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
		printArray(arr);

	}

}
