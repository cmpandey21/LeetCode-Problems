package Leetcode;
/*
Input: n = 1
Output: true
Explanation: 2pow(0) = 1
 */
public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		System.out.println(isPowerOfTwo(n));
	}

	public static boolean isPowerOfTwo(int n) {
       
	     return n > 0 && (n & n - 1) == 0;
		/*if (n <= 0) return false;
		while (n%2 == 0) {n/=2;}
		return n == 1;
		*/
		
		
	}

}
