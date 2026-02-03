package com.string;

import java.util.HashSet;

public class LengthOfLongestSubString {

	public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> list = new HashSet<Character>();
        int left = 0;
        int maxLen = 0;
        for(int right=0;right<n;right++){
            while(list.contains(s.charAt(right))){
                list.remove(s.charAt(left));
                left++;
            }
            list.add(s.charAt(right));
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
	public static void main(String[] args) {
		String s = "abcdga";
		System.out.println(lengthOfLongestSubstring(s));

	}

}
