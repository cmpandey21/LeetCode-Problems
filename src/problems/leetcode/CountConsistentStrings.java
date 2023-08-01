package problems.leetcode;
/*
Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
 */
public class CountConsistentStrings {

	public static void main(String[] args) {
		String allowed = "ab";
		String[] words = {"ad","bd","aaab","baa","badab"};
		int n=countConsistentStrings(allowed,words);
		System.out.println(n);
	}
	
	 public static int countConsistentStrings(String allowed, String[] words) {
		 int [] store=new int[26];
		 int count=words.length;
		 for(int i=0;i<allowed.length();i++)
		 {
			 store[allowed.charAt(i)-'a']++;
		 }
		 
		 for(int i=0;i<words.length;i++)
		 {
			 String word=words[i];
			 for(int j=0;j<word.length();j++)
			 {
			 if(store[word.charAt(j)-'a']<=0)
			 {
				 count--;
				 break;
			 }
		 }
		 }
		  
		 return count;
	 }
}
