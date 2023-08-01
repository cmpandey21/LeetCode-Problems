package problems.leetcode;

/*
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 */

public class BalancedStringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(balancedStringSplit("RLRRLLRLRL"));
		
	}
	
	public static int balancedStringSplit(String s)
	{
		int count=0, ans=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='L')
			{
				count++;
			}
			
			else {
				count--;
			}
			
			if(count==0)
			{
				ans++;
			}
		}
		return ans;
	}
	

}
