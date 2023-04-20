package Leetcode;

import java.util.Arrays;

/*
Input: s = "abc", t = "ahbgdc"
Output: true
 */


public class IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abc", t = "ahbgdc";
		
		System.out.println(isSubsequence(s,t));
		
	}
	
	public static boolean isSubsequence(String s, String t)
	{
		if (s.length() == 0) {
	        return true;
	    }
	    int i = 0;
	    
	    for (int j = 0; j < t.length(); j++) {
	        if (t.charAt(j) == s.charAt(i)) {
	            i++;
	        }
	        if (i == s.length()) {
	            return true;
	        }
	    }
	    
	    return false;

		
	}

}
