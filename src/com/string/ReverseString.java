package com.string;

public class ReverseString {

	public static String reverseString(String s) {
		int n = s.length();
		int i = n-1;
		String res = "";
		while(i>=0) {
			
			res += s.charAt(i);
			i--;
		}
		return res;		
	}
	
	public static void main(String[] args) {
		String s = "HelloJava";
	
		System.out.println(reverseString(s));

	}

}
