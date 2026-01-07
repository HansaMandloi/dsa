package com.Recursion;

import java.util.Scanner;

public class Recursion_11
{
	//Recursion on string
	

	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   System.out.println(s);
	   char ch = s.charAt(0);
	   System.out.println(ch);
	   for(int i = 0;i<s.length();i++)
	   {
		   System.out.print(s.charAt(i));
	   }
	   System.out.println(" "+s.substring(2,6));

	}

}
