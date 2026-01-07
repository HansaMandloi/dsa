package com.leedcode;

public class SortArray 
{
	static void printArray(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void swapInArray(int[]arr,int i ,int j)
	{
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void reverseArrayInlace(int[] arr)
	{
		int n= arr.length;
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			swapInArray(arr,i,j);
		}
		
	}
     static int[] sortArray(int arr[])
     {
    	 int n = arr.length;
    	 int left = 0,right = n-1;
    	 int[] ans = new int[n];
    	 int k = 0;
    	 while(left <= right)
    	 {
    		 if(Math.abs(arr[left]) > Math.abs(arr[right]))
    		 {
    			 ans[k++]= arr[left] * arr[left];
    			 left++;
    		 }
    		 else
    		 {
    			 ans[k++]=arr[right] * arr[right];
    			 right--;
    		 }
    	 }
    	 reverseArrayInlace(ans);
    	 return ans;
     }
	public static void main(String[] args)
	{
		int arr[]= {-10,-4,-6,3,6,8};
		System.out.println("Original Array :");
        printArray(arr);
        int ans[]= sortArray(arr);
        
        System.out.println("Sorted Array");
        printArray(ans);
    }

}
