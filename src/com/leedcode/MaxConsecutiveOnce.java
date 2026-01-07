package com.leedcode;

public class MaxConsecutiveOnce {
	
	public static void main(String[] args) {
	
	int k = 4;
	int arr[] = {1,12,-5,-6,50,3};
	int n = arr.length;
	double ans = 0;
	double window = 0;
	for(int i = 0;i<k;i++) {
		window += arr[i];
	}
	ans  = window / k;
	for(int right = k;right < n;right++) {
		window += arr[right] - arr[right - k];
		ans = Math.max(ans, window/k);
	}
	System.out.println(ans);
	}
	
}
