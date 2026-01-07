package com.arrays;

import java.util.Scanner;

public class Array_2 
{
	static void printArrayElement(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	void inputArray()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array : ");
		int n=sc.nextInt();
		int arr[] =new int[n];
		System.out.println("Enter "+n+" Elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
	    }
		printArrayElement(arr);
		
	}
	void copyArray()
	{
		int arr[] = {3,4,5,6,7,8};
		int brr[] = arr;
		printArrayElement(arr);
		printArrayElement(brr);
		
		brr[0]=1;
		brr[1]=9;
		System.out.println("After changes");
		printArrayElement(arr);
		printArrayElement(brr);
	}

	public static void main(String[] args) 
	{
		Array_2 ar = new Array_2();
		//ar.inputArray();
		ar.copyArray();
	}

}
