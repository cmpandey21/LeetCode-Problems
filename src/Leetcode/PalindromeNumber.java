package Leetcode;

/*
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
 */

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=121;
		boolean result=isPalindrome(a);
		System.out.println(result);
	}
	
public static boolean isPalindrome(int x) {

	String s=String.valueOf(x);
	String s1="";
	for(int i=s.length()-1;i>=0;i--)
	{
		s1=s1+s.charAt(i);
	}
	
	if(s.equals(s1))
	{
		return true;
	}
	else
	{
	return false;
	}
        
    }

}
