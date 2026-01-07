package com.BinarySearch;

public class search2DMatrix {
	
	static boolean serachMatrix(int matrix[][], int target)
	{
		int n = matrix.length;
        int m = matrix[0].length;
        int st = 0;
        int end = n*m - 1;
        while(st<=end)
        {
            int mid = st + (end-st)/2;
            int midElt = matrix[mid/m][mid%m];
            if(target==midElt)
            {
                return true;
            }
            if(target > midElt)
            {
                st = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
		return false;
	}

	public static void main(String[] args) 
	{
		int arr[][] ={ {1,2,3,4},{5,12,16,24},{44,55,66,77}};
		System.out.println(serachMatrix(arr, 16));

	}

}
