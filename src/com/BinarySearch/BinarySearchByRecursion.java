package com.BinarySearch;

public class BinarySearchByRecursion
{
    static boolean binarySearch(int arr[],int st,int end,int target)
    {
    	if(st>end) return false;
    	int mid = (st+end)/2;   //st+((end-st)/2  better way 
    	if(target==arr[mid]) return true;
    	else if(target>arr[mid]) 
    	{
    		return binarySearch(arr, mid+1, end,target);
    	}
    	else {
    		return binarySearch(arr, st, mid-1,target);
    	}
    }
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6,7};
		int n = arr.length-1;
		 System.out.println(binarySearch(arr, 0, n,9));

	}

}
