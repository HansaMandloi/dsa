 package com.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArrayList
{

	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(2);
		list.add(30);
		list.add(43);
		list.add(50);
		list.add(36);
		list.add(17);
		list.add(28);
        
		System.out.println("Original List: "+list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		ArrayList<String>l1 = new ArrayList<String>();
		l1.add("Welcome");
		l1.add("to");
		l1.add("My");
		l1.add("my World");
		System.out.println("OG"+l1);
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println(l1);
	}

}
