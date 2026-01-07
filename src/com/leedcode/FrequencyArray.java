package com.leedcode;

import java.util.Scanner;

public class FrequencyArray 
{
	static void printArray(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static int[] makeFrequencyArray(int[]arr)
	{
		int[]freq = new int[100005];
		for(int i = 0;i<arr.length;i++)
		{
			freq[arr[i]]++;
			
		}
		return freq;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[]= {1,100,2200,34000,100000};
		int[] freq = makeFrequencyArray(arr);
		System.out.println("Enter number of queries");
		int q = sc.nextInt();
		while(q>0)
		{
			System.out.println("Enter number to be searched ");
			int x = sc.nextInt();
			if(freq[x]>0)
			{
				System.out.println("yes");
			}else System.out.println("No");
			q--;
		}

	}

}
