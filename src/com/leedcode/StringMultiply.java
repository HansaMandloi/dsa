package com.leedcode;

public class StringMultiply {

	public static String multi(String num1, String num2) {
		long x = Integer.parseInt(num1);
		long y = Integer.parseInt(num2);
		long z = x*y;
		String res = String.valueOf(z);
		return res;
	}
	public static void main(String[] args) {
		String num1 = "6913259244";
		String num2 = "71103343";
		System.out.println(multi(num1, num2));
	}

}
