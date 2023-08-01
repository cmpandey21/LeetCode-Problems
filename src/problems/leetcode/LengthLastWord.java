package problems.leetcode;

public class LengthLastWord {
	public int lengthOfLastWord(String s) {
        String s1[]=s.split(" ");
       
        s = s1[s1.length-1];
      int count=s.length();
      return count;


    }
}
