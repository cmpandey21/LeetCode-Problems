package Leetcode;
/*
 * Input: num = "51230100"
Output: "512301"
Explanation: Integer "51230100" has 2 trailing zeros, we remove them and return integer "512301".
 */
public class RemoveTrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "51230100";
		System.out.println(removeTrailingZeros(num));

	}
public static String removeTrailingZeros(String num) {
	/*String s="";
	for(int i=0;i<num.length()-1;i++)
	{
		if(num.charAt(i)!='0' || num.charAt(i+1)!='0')
		{
			s=s+num.charAt(i);
		}
		
	}
	
	if(num.charAt(num.length()-1)!='0' && num.length()-2!='0')
	{
		s=s+num.charAt(num.length()-1);
	}
	
	return s;*/
	int j = num.length() - 1;
    
    while (j >= 0 && num.charAt(j) == '0') {
        j--;
    }
    
    return num.substring(0, j + 1);
        
    }
}


