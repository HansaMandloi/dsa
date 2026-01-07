package com.Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Recursion_10 {
	
	static ArrayList<Integer> allIndices(int arr[],int target,int idx)
	{
		int n = arr.length-1;
		if(idx>n)
		{
			return new ArrayList<Integer>();
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(target==arr[idx])
		{
			list.add(idx);
		}
		 ArrayList<Integer> smallAns = allIndices(arr, target, ++idx);
		 list.addAll(smallAns);
		 return list;
	}
	static void FindAllIndices(int arr[],int target,int idx)
	{
		int n = arr.length-1;
		if(idx>n)
		{
			return ;
		}
		if(target==arr[idx])
		{
			System.out.println(idx);
		}
		FindAllIndices(arr, target, ++idx);
	}

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,4};
		//FindAllIndices(arr, 4, 0);
        ArrayList<Integer> ans = allIndices(arr, 5, 0);
        for(int i = 0;i<ans.size();i++)
        {
        	System.out.println(ans);
        }
	}

}
