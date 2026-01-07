package com.leedcode;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestMountain 
{
	static int LongMountain(int arr[])
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Arrays.sort(arr);
		list.add(arr[0]);
		for(int i = 1;i<arr.length;i++)
		{
			if(arr[i-1]==arr[i]) {
				continue;
			}
			else
			{
				list.add(arr[i]);
			}
		}
		return list.size();
	}

	public static void main(String[] args) 
	{
		int arr[]= {3,2,1,2,4,5,6,7};
		System.out.println(LongMountain(arr));

	}

}
