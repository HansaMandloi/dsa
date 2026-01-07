package com.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ReverseArrayList
{

	static void reverseList(ArrayList<Integer>list)
	{
		int i = 0 ,j = list.size()-1;
		while(i<j)
		{
			Integer temp = Integer.valueOf(list.get(i));
			list.set(i, list.get(j));
			list.set(j, temp);
			i++;
			j--;
		}
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
        
		System.out.println("Original List: "+list);
        reverseList(list);
        System.out.println("Reverese List: "+list);
//        Collections.reverse(list);
//        System.out.println("Reverese List by collection class : "+list);
	}

}
