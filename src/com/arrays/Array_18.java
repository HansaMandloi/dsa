package com.arrays;
  //sort Zero and one with only one loop
public class Array_18 
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
	static void sortZeroesAndonese(int arr[])
	{
		int n = arr.length;
		int left=0,right=n-1;
		
		while(left<right)
		{
			 if(arr[left]==1 && arr[right]==0)
			 {
				 swapInArray(arr, left, right);
				 left++;
				 right--;
			 }
			 if(arr[left]==0 ) left++;
			 if( arr[right]==1)  right--;
			 
		}
	}
	public static void main(String[] args) 
	{
		 int arr[]= {0,1,0,1,0,0,1,1,0};
	        System.out.print("Original Value :-");
	        printArray(arr);
	        sortZeroesAndonese(arr);
	        System.out.print("Sorted  Array :- ");
	        printArray(arr);

	}

}
