package com.TwoDArray;

import java.util.Scanner;

public class SpiralOrder 
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
	static void printSpiralOrder(int[][]matrix,int r,int c)
	{
		int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
		int totalElements = 0;
		while(totalElements < r*c)
		{
			//topRow -> leftCol to rightCol
			for(int j=leftCol;j<=rightCol&&totalElements < r*c;j++)
			{
				System.out.print(matrix[topRow][j]+" ");
				totalElements++;
			}
			topRow++;
			//rightCol -> topRow to BottomRow
			for(int i = topRow; i<=bottomRow&&totalElements < r*c;i++)
			{
				System.out.print(matrix[i][rightCol]+" ");
				totalElements++;
			}
			
			//bottomRow -> rightCol  to LeftCol
			rightCol--;
			for(int j = rightCol;j>=leftCol&&totalElements < r*c;j--)
			{
				System.out.print(matrix[bottomRow][j]+" ");
				totalElements++;
			}
			
			//leftCol -> bottomRow to TopRow
			bottomRow--;
			for(int i = bottomRow;i>=topRow&&totalElements < r*c;i--)
			{
				System.out.print(matrix[i][leftCol]+" ");
				totalElements++;
			}
			leftCol++;
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows and columns :");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int [][]matrix = new int[r][c];
		int total = r*c;
		System.out.println("Enter "+total+" values :");
		
		for(int i = 0; i<r;i++)
		{
			for(int j =0;j<c;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Input Matrix :");
		printArray(matrix);
		System.out.println("Spiral  Order");
		printSpiralOrder(matrix, r, c);
	}

}
