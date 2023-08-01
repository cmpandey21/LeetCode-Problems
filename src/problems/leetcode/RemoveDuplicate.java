package problems.leetcode;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aaddc";
		System.out.println(minimizedStringLength(s));
	}
	public static int minimizedStringLength(String str) {
		
	     LinkedHashSet<Character> set = new LinkedHashSet<>();

	        // Iterate through each character in the string
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            set.add(c);
	        }

	        // Build the result string from the characters in the set
	        StringBuilder sb = new StringBuilder();
	        for (Character c : set) {
	            sb.append(c);
	        }

	        return sb.toString().length();
			
	    
	    }

}
