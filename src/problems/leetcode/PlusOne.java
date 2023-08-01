package problems.leetcode;
/*
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
 */
public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] digits = {1,2,3};
	    plusOne(digits);
		for(int i=0;i<digits.length;i++)
		{
			System.out.print(digits[i]);
		}
	}
	
	public static int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]!=9)
            {
            	digits[i]++;
            	break;
            }
            else
            {
            	digits[i]=0;
            }
        }

        if(digits[0]==0)
        {
        	int [] res=new int[digits.length+1];
        	
        	res[0]=1;
        	
        	return res;
        }

        return digits;
    }

}
