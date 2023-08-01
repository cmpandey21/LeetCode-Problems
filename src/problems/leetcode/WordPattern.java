package problems.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
 */
public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pattern = "abba", s = "dog cat cat fish";
		System.out.println(wordPattern(pattern,s));
	}
	
    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> charToWord=new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();
        String [] words=s.split(" ");
        if (words.length != pattern.length())
            return false;
        
        for(int i=0;i<pattern.length();i++)
        {
        	char c = pattern.charAt(i);
            String word = words[i];
        	
            if (!charToWord.containsKey(c)) {
                charToWord.put(c, word);
            }
            
            if (!wordToChar.containsKey(word)) {
                wordToChar.put(word, c);
            }

            if (!charToWord.get(c).equals(word) || !wordToChar.get(word).equals(c)) {
                return false;
            }
        }
    	
    	return true;
    }

}
