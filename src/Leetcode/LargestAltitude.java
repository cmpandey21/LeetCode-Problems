package Leetcode;
/*
Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
 */
public class LargestAltitude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] gain = {-5,1,5,0,-7};
		 System.out.println(largestAltitude(gain));
		 //largestAltitude(gain);
	}
	
	public static int largestAltitude(int[] gain) {
        int [] arr=new int[gain.length+1];
        arr[0]=0;
        int sum=0;
        int k=1;
    
        for(int i=0;i<gain.length;i++)
        {
            
           sum=sum+gain[i];
           arr[k]=sum;
           k++;
          
        }

        int max=arr[0];

        for(int i=0;i<arr.length;i++)
        {
        
            if(max <arr[i])
           {
               max=arr[i];
           }
        }

        return max;
    }

}
