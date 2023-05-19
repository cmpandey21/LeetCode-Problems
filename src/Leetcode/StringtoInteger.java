package Leetcode;
/*
Input: s = "42"
Output: 42
Explanation: The underlined characters are what is read in, the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)*/
public class StringtoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="words and 987";
		System.out.println(myAtoi(s)); 
	}
	 public static int myAtoi(String s) {
		 String s1="";
		 
		
		 
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)=='-')
		 {
			 s1=s1+s.charAt(i);
		 }
			 
			
			 if(s.charAt(i)>='0' && s.charAt(i)<='9')
			 {
				 s1=s1+s.charAt(i);
			 }
		 }
		
	     int result=Integer.valueOf(s1);
	     return result;   
	    }

}
