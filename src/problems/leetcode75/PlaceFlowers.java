/*
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
 */
package problems.leetcode75;

public class PlaceFlowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] flowerbed = {1,0,0,0,1};
		int n=1;
		System.out.println(canPlaceFlowers(flowerbed,n));
		
	}
	
	 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
	     int count =0;
		 
	     for(int i=0;i<flowerbed.length;i++)
	     {
	    	 if(flowerbed[i]==0)
	    	 {
	    		 int prev=(i==0 || flowerbed[i-1]==0)?0:1;
	    		 int next=(i==flowerbed.length-1 || flowerbed[i+1]==0)?0:1;
	    		 
	    		 if(prev ==0 && next==0)
	    		 {
	    			 flowerbed[i]=1;
	    			 count++;
	    		 }
	    	 }
	    	 
	    
	    	 if(count>=n)
	    	 {
	    		 return true;
	    	 }
	     }
	     
	     return false;
	    }
}
