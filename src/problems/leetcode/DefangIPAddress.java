package problems.leetcode;

public class DefangIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=defangIPAddress("1.1.1.1");
		System.out.println(s);
	}
	
	public static String defangIPAddress(String address)
	{

        String str="";

        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
            {
str=str+"["+address.charAt(i)+"]";
            }

            else
            {
                str=str+address.charAt(i);
            }
        }
		return str;
		
	}

}
