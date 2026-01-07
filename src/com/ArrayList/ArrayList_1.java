package com.ArrayList;

import java.util.ArrayList;
public class ArrayList_1 
{

	public static void main(String[] args)
	{
       //Wrapper class
//		Integer i = Integer.valueOf(4);
//		System.out.println(i);
//		Float f = Float.valueOf(4.5f);
//		System.out.println(f);
		
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		
		System.out.println(l1.get(1));
		for(int i =0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		System.out.println(l1);
		
	}

}
