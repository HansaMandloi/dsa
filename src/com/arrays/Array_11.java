package com.arrays;

public class Array_11 
{

	static void swapwithoutTemp(int x,int y)
	{
		System.out.println("After Swapping :");
        x=x-y;
        y=x+y;
        x=y-x;
        System.out.println(x+" "+y);
	}
	public static void main(String[] args) 
	{
		int x=7;
		int y=3;
		swapwithoutTemp(x, y);
		

	}

}
