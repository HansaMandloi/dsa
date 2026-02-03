package com.arrays;

public class peakElement {

	public static int findPeak(int arr[]) {
		for(int i = 1;i<arr.length-1;i++) {
			if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]) {
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,2,5,0};
		int ans = findPeak(arr);
		System.out.println(ans);
	}

}
