package leetcode.daily.challenge;
import java.util.Arrays;
/*
Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code"
 */
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		/*
		String s = "leetcode";
	     List<String> wordDict =Arrays.asList("leet","code");
	    */
	 	 String s = "catsandog";
	     List<String> wordDict =Arrays.asList("cats","dog","sand","and","cat");
	     System.out.println(wordBreak(s,wordDict));
	}

	public static boolean wordBreak(String s, List<String> wordDict) {

		
		int len = s.length();
        boolean[] f = new boolean[len+1];
        f[0] = true;
        for (int i=1; i<len+1; i++)
            for (int j=0; j<i; j++)
                if (f[j] && wordDict.contains(s.substring(j,i)))
                {
                    f[i] = true;
                    break;
                }
        return f[len];
		
	}

}
