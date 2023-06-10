package Leetcode;
/*
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
 */
public class Reverse_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="  hello world  ";
		System.out.println(reverseWords(s));
	}
	public static String reverseWords(String s) {
    
		String [] s1=s.trim().split(" +"); //split(" +") will also if there are multiple space
		String s2="";
	    for(int i=s1.length-1;i>0;i--)
	    {
	    	s2=s2+s1[i]+" ";
	    	
	    }
	    
	    s2=s2+s1[0];
	    
	    return s2;
    }
	

}
