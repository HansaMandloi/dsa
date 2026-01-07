package com.BinarySearch;

public class FindTargetInRotatedSortedArray 
{
	
    static int  FindTarget(int arr[],int target)
    {
    	int st = 0;
    	int end = arr.length - 1;
    	while(st<=end)
    	{
    		int mid = st + (end-st)/2;
    		if(arr[mid]==target)
    		{
    			return mid;
    		}
    		else if(arr[mid]<arr[end]) //mid to end Array is sorted
    		{
    			if(target > arr[mid] && target <= arr[end])
    				st = mid + 1;
    			else
    				end = mid - 1;
    		}
    		else     //st to mid Array is sorted
    		{
    			if(target >= arr[st] && target < arr[mid])
    			    end = mid-1;
    			else
    			    st = mid +1;
    		}
    	}
    	return -1;
    	
    }
	public static void main(String[] args) 
	{
//		int arr[] = {3,4,5,1,2};
//		int arr[] = {9,10,11,12,1,2,3,4,5,6,7,8};
//		int arr[] = {3,4,5,1,2};
		int arr[]= {4,5,6,7,0,1,2};
		//int arr[] = {1,3};
		int target = 4;
		System.out.println(FindTarget(arr,target));

	}

}
