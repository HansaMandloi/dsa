package com.BinarySearch;

public class BinarySearch {
	static boolean binarySearch(int a[],int target)
	{
		int n = a.length;
		int st = 0,end = n-1;
		while(st<=end)
		{
			int mid = (st+end)/2;
			if(target==a[mid]) return true;
			
			else if(target<a[mid]) {
				end = mid-1;
			}
			else if(target>a[mid])
			{
				st = mid+1;
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int arr[] = {2,4,5,7,20,24,45,50,77};
		int target = 0;
		while(target!=10)
		{
        System.out.printf(" %d Exist in array : %b ",target,binarySearch(arr, target));
        System.out.println();
        target++;
		}	
	}
}