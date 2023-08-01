package problems.leetcode;

import java.util.Arrays;

/*
Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
 */
public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomNote = "aab", magazine = "baa";
		System.out.println(canConstruct(ransomNote, magazine));

	}

	public static boolean canConstruct(String ransomNote, String magazine) {
	
		
		int [] arr=new int[26];
		for(int i=0;i<magazine.length();i++)
		{
			arr[magazine.charAt(i)-'a']++;
		}
		
		for(int i=0;i<ransomNote.length();i++)
		{
			if(arr[ransomNote.charAt(i)-'a'] == 0)
			{
				return false;
			}
			
			else
			{
				arr[ransomNote.charAt(i)-'a']--;
			}
				
		}

		return true;
	}

}
