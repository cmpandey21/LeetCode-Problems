package problems.leetcode;

/*
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
 */
public class ShuffleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "codeleet";
		int [] indices = {4,5,6,7,0,2,1,3};
	    
	     System.out.println(restoreString(s,indices));
	
	}
	 public static String restoreString(String s, int[] indices) {
	        
		 char ch[]= new char[s.length()];
		 
		 for(int i=0;i<indices.length;i++)
		 {
			 ch[indices[i]]=s.charAt(i);
		 }
		 
		 
		 
		 return String.valueOf(ch);
	    }

}
