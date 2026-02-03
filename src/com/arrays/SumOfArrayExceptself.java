package com.arrays;

public class SumOfArrayExceptself {

	public static int[] SumArray(int arr[]) {
		int n = arr.length;
		int ans[] = new int[n];
		int j = 0;
		while(j<n) {
		for(int i = 0;i<n;i++) {
			if(i==j) continue;
			ans[j] += arr[i];
		}
			j++;
		}
		
		return ans;
	}
	public static void main(String[] args) {
		int arr[] = {2,3,4,5,9};
		int ans[] = SumArray(arr);
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();

		
		for (int i : ans) {
			System.out.print(i+" ");
		}

	}

}
