package Leetcode;

/*
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
 */
public class MergeStringsAlternately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word1 = "abcd", word2 = "pq";
		
		System.out.println(mergeAlternately(word1,word2));
	}
     public static String mergeAlternately(String word1, String word2) {
        
    	 String word3="";
    	 int lword1=word1.length();
    	 int lword2=word2.length();
    	 
    	 if(lword1==lword2)
    	 {
    		 for(int i=0;i<lword1;i++)
    		 {
    			 word3=word3+word1.charAt(i)+word2.charAt(i);
    		 }
    		 
    		 return word3;
    	 }
    	 
    	 else if(lword1>lword2)
    	 {
    		 for(int i=0;i<lword2;i++)
    		 {
    			 word3=word3+word1.charAt(i)+word2.charAt(i);
    		 }
    		 
    		 word3=word3+word1.substring(lword2);
    		 
    		 return word3;
    	 }
    	 
    	 else
    	 {
    		 for(int i=0;i<lword1;i++)
    		 {
    			 word3=word3+word1.charAt(i)+word2.charAt(i);
    		 }
    		 
    		 word3=word3+word2.substring(lword1);
    		 return word3;
    	 }
    }
     
     //Alternative solution with better complexity
     public String mergeAlternately1(String word1, String word2) {
         StringBuilder sb = new StringBuilder();
         int lenmax = Math.max(word1.length(),word2.length());
         for(int i=0;i<=lenmax-1;i++)
         {
             if(i<word1.length()) sb.append(word1.charAt(i));
             if(i<word2.length()) sb.append(word2.charAt(i));
         }
         return sb.toString();
     }
     
     
}
