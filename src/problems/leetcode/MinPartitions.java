package problems.leetcode;
/*Input: n = "32"
Output: 3
Explanation: 10 + 11 + 11 = 32*/

public class MinPartitions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n="82734";
		int result=minPartitions(n);
		System.out.println(result);
		
	}
	
	 public static int minPartitions(String n) {
	        
		 int max=0;
		 
		 for(int i=0;i<n.length();i++)
		 {
			 if(n.charAt(i)-'0'==9)
				 return 9;
			 
			 max=Math.max(max, (n.charAt(i)-'0'));
		 }
		 
		 return max;
	    }
	}


