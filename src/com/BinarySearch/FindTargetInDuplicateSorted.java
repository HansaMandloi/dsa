package com.BinarySearch;

public class FindTargetInDuplicateSorted {

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
    		else if(arr[st] == arr[mid] && arr[end]==arr[mid])
    		{
    			st++;
    			end--;
    		}
    		else if(arr[mid]<=arr[end]) //mid to end Array is sorted
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

		int arr[]= {1,1,1,1,2,2,3,4,1};
		
		int target = 4;
		System.out.println(FindTarget(arr,target));

	}
}
