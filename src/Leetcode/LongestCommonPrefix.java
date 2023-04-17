package Leetcode;

import java.util.Arrays;

/*
Input: strs = ["flower","flow","flight"]
Output: "fl"
 */

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strs= {"flower","flow","flight"};
		LongestCommonPrefix ob=new LongestCommonPrefix();
		
		System.out.println(ob.longestcommonprefix(strs));
		
	}
	

	public String longestcommonprefix(String[] strs)
	{
		if(strs.length==0 || strs==null )
			return "";
		
		Arrays.sort(strs);
		 String first=strs[0];
		 String last=strs[strs.length-1];
		 
		 int i=0;
		 while(i<first.length())
		 {
			 if(first.charAt(i)==last.charAt(i))
			 {
				 i++;
			 }
			 
			 else
				 break;
			 
		 }
		 
		 return i==0?"":first.substring(0, i);
		 
		 
	}
	

}
