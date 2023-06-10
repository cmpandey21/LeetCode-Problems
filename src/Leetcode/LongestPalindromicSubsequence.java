package Leetcode;

/*
Input: s = "bbbab"
Output: 4
Explanation: One possible longest palindromic subsequence is "bbbb".
 */

public class LongestPalindromicSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s=longestPalindromeSubseq("bbbab");
		int s1=longestPalindromeSubseq("aabaa");
		System.out.println(s);
		System.out.println(s1);
	}
	
	public static int longestPalindromeSubseq(String s) {
	     int count=0;
	     if(s.length()==1)
	     {
	    	 return 1;
	     }
	     else
	    	 
	     for(int i=0;i<s.length();i++)
	     {
	    	 for(int j=i+1;i<s.length();i++)
	    	 {
	         if(s.charAt(i)==s.charAt(j))
	         {
	             count++;
	         }
	         }

	     }
	     
	     return count;

}
	
}
