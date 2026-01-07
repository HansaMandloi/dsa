package com.leedcode;

 public class Solution
 {
    static int firstMissingPositive(int[] nums) 
    {
    	int n = nums.length;
        int a = 1;
         
        for(int i = 1;i<n;i++)
        {
        	boolean flag = false;
           for(int j = 0; j<n;j++)
           {
              if(i == nums[j])
              {
            	
                a=i;
                flag = true;
              }  
//              else {
//            	  flag = false;
//              }
          } 
           if(flag == false)
           {
        	   return i;
           }
           
        }
       return a;
    }
    public static void main(String []args)
    {
    //	int arr[]= {3,4,-1,1};
    	int arr[]= {100000, 3, 4000, 2, 15, 1, 99999};
    	int ans = firstMissingPositive(arr);
    	System.out.println(ans);
    }

 }
// class Solution {
//	    public int firstMissingPositive(int[] nums) {
//	        int n = nums.length;
//
//	        for (int i = 1; i <= n; i++) {  // fixed: i <= n
//	            boolean found = false;
//
//	            for (int j = 0; j < n; j++) {
//	                if (nums[j] == i) {
//	                    found = true;
//	                    break;  // stop searching once found
//	                }
//	            }
//
//	            if (!found) {
//	                return i;
//	            }
//	        }
//
//	        return n + 1;  // All numbers 1..n are present
//	    }
//	}
// class Solution 
// {
//	    public int firstMissingPositive(int[] nums) {
//	        int n = nums.length;
//
//	        // Place each number in its correct position if possible
//	        for (int i = 0; i < n; i++) {
//	            while (
//	                nums[i] > 0 && 
//	                nums[i] <= n && 
//	                nums[nums[i] - 1] != nums[i]
//	            ) {
//	                int correctIndex = nums[i] - 1;
//	                // swap nums[i] with nums[correctIndex]
//	                int temp = nums[i];
//	                nums[i] = nums[correctIndex];
//	                nums[correctIndex] = temp;
//	            }
//	        }
//
//	        // After rearranging, find the first index i where nums[i] != i + 1
//	        for (int i = 0; i < n; i++) {
//	            if (nums[i] != i + 1) {
//	                return i + 1;
//	            }
//	        }
//
//	        // If all positions are correct, return n + 1
//	        return n + 1;
//	    }
//	}

 
 
 