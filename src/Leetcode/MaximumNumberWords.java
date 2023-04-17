package Leetcode;
/*
Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
 */
public class MaximumNumberWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		
		System.out.println(maximumNumberWords(s));
	}
	
	public static int maximumNumberWords(String [] s)
	{
	
		
		int max=0;
		for(int i=0;i<s.length;i++)
		{
			String[] newStr = s[i].split(" ");
			max = Math.max(newStr.length,max);
			  
		  }
		
		return max;
		
		}
		
		
	}


