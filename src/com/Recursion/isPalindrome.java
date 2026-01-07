package com.Recursion;

import java.util.Scanner;

public class isPalindrome 

{
	//Method 2
	static Boolean ispalindrom(String s,int l,int r)
	{
		if(l>=r)
		{
			return true;
		}
		return (s.charAt(l) == s.charAt(r) && ispalindrom(s, l+1, r-1));
		
	}
	
	//Method 1
    static String palindrome(String s,int idx)
    {
    	if(idx==s.length()) return "";
    	String smallAns = palindrome(s, idx+1);
    	return smallAns+s.charAt(idx);
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String rev = palindrome(s, 0);
		System.out.println(rev);
		if(rev.equals(s))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		System.out.println(ispalindrom(s, 0, s.length()-1));

	}

}
