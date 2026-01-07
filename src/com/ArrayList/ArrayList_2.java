package com.ArrayList;

import java.util.ArrayList;

public class ArrayList_2 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		
		l1.add(1,100);
		System.out.println(l1);
		
		
		l1.set(2,10);   //(index,integer Element)
		System.out.println(l1);
		
		
		l1.remove(1);   //(index)
		System.out.println(l1);
		
		
		l1.remove(Integer.valueOf(7)); //(Element)
		System.out.println(l1);
		
		boolean ans = l1.contains(Integer.valueOf(8));//this check value are present in list or not
		System.out.println(ans);
		
		ArrayList l = new ArrayList();
		l.add("hansa");
		l.add(1);
		l.add(true);
		System.out.println(l);

	}

}
