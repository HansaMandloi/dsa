package com.Recursion;

public class printSSQ {

	static void printSubSQ(String s,String currAns)
	{
		if(s.length()==0)
		{
			System.out.println(currAns); 
			return;
		}
		char curr = s.charAt(0);
		String remString = s.substring(1);
		printSubSQ(remString,currAns+curr);
		printSubSQ(remString,currAns);
		
	}
	public static void main(String[] args) 
	{
		printSubSQ("abc","");
	}

}
