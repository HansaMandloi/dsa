package com.arrays;

public class MinEleInRotateArray {

	public static int minEle(int arr[]) {
	int i=0,j=arr.length-1;
	
	while(i<j) {
		int mid = i+(j-i)/2; 
		if(arr[mid]>arr[j]) {
			i = mid+1;
		}
		else {
			j = mid;
		}
	}
	return arr[i];
	
	}
	public static void main(String[] args) {
		
		int arr[] = {5,6,7,1,2,3};
		int ans = minEle(arr);
		System.out.println(minEle(arr));

	}

}
