package com.arrays;
  //even first and than odd print in array
public class Array_19
{
	static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void swapInArray(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static int[] evenFirst(int arr[])
	{
		int n=arr.length;
		int left=0,right=n-1;
		while(left<right)
		{
			if(arr[left] %2 == 1 && arr[right] %2 == 0)
			{
				swapInArray(arr, left, right);
				left++;
				right--;
			}
			if(arr[left] % 2 == 0) left++;
			if(arr[right] % 2 == 1) right--;
		}
		return arr;
	}
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6,7,8};
        System.out.print("Original Value :-");
        printArray(arr);
        evenFirst(arr);
        System.out.print("Sorted  Array :- ");
        printArray(arr);

	}

}
