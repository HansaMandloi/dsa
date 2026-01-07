package com.sorting;

public class BubbleSort {

	static void bubleSort(int[] a) // all TC are - o(n^2)
	{
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	static void bubleSort2(int[] a) // best case time complexity - o(n)
	{
		int n = a.length;
		for (int i = 0; i < n; i++) {
			boolean flag = false; // has any swaping happened
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {

					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
					flag = true;
				}
			}
			if (flag == false) {
				return;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 100, 9, 7, 5, 6, 3, 2, 0 };
		bubleSort(arr);
		bubleSort2(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}
}
