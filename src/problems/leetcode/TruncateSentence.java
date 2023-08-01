package problems.leetcode;

/*
Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
 */
public class TruncateSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s = "Hello how are you Contestant";
		 int k=4;
		 
		String s1=truncateSentence(s,k);
		System.out.println(s1);
	}

	
   public static String truncateSentence(String s, int k) {
     
	  
	   String s1[]=s.split(" ");
	   String s2="";
	   for(int i=0;i<k;i++)
	   {
		   s2=s2+s1[i];
		   if(i!=k-1)
		   {
			   s2=s2+" ";
		   }
	   }
	   return s2;
    }
}
