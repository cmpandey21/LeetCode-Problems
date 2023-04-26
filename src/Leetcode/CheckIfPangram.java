package Leetcode;
/*
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet
 */
public class CheckIfPangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String s="thequickbrownfoxjumpsoverthelazydog";
		String s1="leetcode";
		System.out.println(checkIfPangram(s));
		System.out.println(checkIfPangram(s1));
	}
	
	 public static boolean checkIfPangram(String s) {
		 boolean [] arr=new boolean[26];
		 for(int i=0;i<s.length();i++)
		 {
			 int index=s.charAt(i)-'a';
			 
			 arr[index]=true;
		 }
		 
		 for(int i=0;i<26;i++)
		 {
			 if(arr[i]==false)
			 {
				 return false;
			 }
		 }
		 
		 
		 
		return true;
	        
	    }

}
