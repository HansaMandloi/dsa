package com.leedcode;

import java.util.HashMap;
import java.util.Map;

public class SubarrayEqualOfK {

	public static void main(String[] args) {
		int k = 5;
		int arr[] = {1,2,3,4,5,0,1,2};
		int res = 0;
		int curr = 0;
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		for(int i : arr) {
			curr += i;
			System.out.print(curr+" ");
			res += map.getOrDefault(curr-k, 0);
			map.put(curr, map.getOrDefault(curr,0)+1);
		}
		System.out.println("\n"+res);
	}

}
