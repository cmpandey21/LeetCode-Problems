package Leetcode;

import java.util.Arrays;

/*
Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
 */

public class SortingtheSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "is2 sentence4 This1 a3";
		
		System.out.println(sortSentence(s));
	}
	
public static String sortSentence(String s) {
	String s1[]=s.split(" ");
	int n=s1.length;
	String[] s2=new String[n];
	for(int i=0;i<n;i++)
	{
		String temp=s1[i];
	
	String temp1=temp.substring(0, temp.length()-1);
	int index=temp.charAt(temp.length()-1)-'0'-1;
	
	s2[index]=temp1;
	
	
	}
	
        s=String.join(" ", s2);
        return s;
    }

}
