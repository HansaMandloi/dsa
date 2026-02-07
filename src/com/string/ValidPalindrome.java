package com.string;

public class ValidPalindrome {

	public boolean validPalid(String s) {
		s.replace(" ", "");
		int n = s.length();
		int i = 0,j = n-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;j--;
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "abcdba";
		ValidPalindrome vp = new ValidPalindrome();
		System.out.println(vp.validPalid(s));

	}

}
