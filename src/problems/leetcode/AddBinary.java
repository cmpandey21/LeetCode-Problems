package problems.leetcode;

/*
Input: a = "11", b = "1"
Output: "100"
 */
public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "11", b = "1";
		System.out.println(addBinary(a,b));
	}
	 public static String addBinary(String a, String b) {
	        String result="";
	        int carry=0;
	        int al=a.length();
	        int bl=b.length();
	        int i=0;
	        
	        while(i<al || i<bl || carry!=0)
	        {
	        	int x=0;
	        	if(i<al && a.charAt(al-1-i)=='1')
	        	{
	        		x=1;
	        	}
	        	
	        	int y=0;
	        	if(i<bl && b.charAt(bl-1-i)=='1')
	        	{
	        		y=1;
	        	}
	        	
	        	result=(x+y+carry)%2+result;
	        	carry=(x+y+carry)/2;
	        	i++;
	        }
	        
	        return result;
	        
	    }

}
