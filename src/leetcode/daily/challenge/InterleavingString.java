package leetcode.daily.challenge;

import java.util.Arrays;

/*
Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
Output: true
Explanation: One way to obtain s3 is:
Split s1 into s1 = "aa" + "bc" + "c", and s2 into s2 = "dbbc" + "a".
Interleaving the two splits, we get "aa" + "dbbc" + "bc" + "a" + "c" = "aadbbcbcac".
Since s3 can be obtained by interleaving s1 and s2, we return true. 
 */

public class InterleavingString {

	public static void main(String[] args) {
	
		 String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";

		 System.out.println(isInterleave(s1,s2,s3));

	}

	private static boolean isInterleave(String s1, String s2, String s3) {
		
		   int m = s1.length(), n = s2.length(), l = s3.length();
	        if (m + n != l) return false;

	        boolean[] dp = new boolean[n + 1];
	        dp[0] = true;

	        for (int j = 1; j <= n; ++j) {
	            dp[j] = dp[j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
	        }

	        for (int i = 1; i <= m; ++i) {
	            dp[0] = dp[0] && s1.charAt(i - 1) == s3.charAt(i - 1);
	            for (int j = 1; j <= n; ++j) {
	                dp[j] = (dp[j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) || (dp[j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
	            }
	        }
	        
	        return dp[n];
		
	}

	
}
