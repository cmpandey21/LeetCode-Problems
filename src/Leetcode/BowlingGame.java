package Leetcode;
/*
Input: player1 = [4,10,7,9], player2 = [6,5,2,3]
Output: 1
 */

//[3,5,7,6], player2 = [8,10,10,2]
public class BowlingGame {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] player1 = {2,3};
		int [] player2 = {4,1};
		int result=isWinner(player1,player2);
		System.out.println(result);

	}
	
	 public static int isWinner(int[] player1, int[] player2) {
	     
	        int n=player1.length;

	      int [] arr=new int[n];
	      int [] arr1=new int[n];
	      
	      
	      arr[0]=player1[0];
	      arr1[0]=player2[0];
	      int sum1=0,sum2=0;
	      for(int i=1;i<n;i++)
	      {
	    	  if(i!=1) {
	    	  if(player1[i-1]==10 || player1[i-2]==10 )
	    	  {
	    		  arr[i]=arr[i-1]+2*player1[i];
	    	  }
	    	  else
	    	  {
	    		  arr[i]=arr[i-1]+player1[i];
	    	  }
	    	  }
	    	  
	    	  else
	    	  {
	    		  if(player1[i-1]==10)
	    		  {
		    		  arr[i]=arr[i-1]+2*player1[i];
		    	  }
		    	  else
		    	  {
		    		  arr[i]=arr[i-1]+player1[i];
		    	  }
	    			  
	    		  
	    	  }
	      }
	      
	      for(int i=1;i<n;i++)
	      {  if(i!=1) {
	    	  if(player2[i-1]==10 || player2[i-2]==10)
	    	  {
	    		  arr1[i]=arr1[i-1]+2*player2[i];
	    	  }
	    	  else
	    	  {
	    		  arr1[i]=arr1[i-1]+player2[i];
	    	  }
	      }
	    	  else
	    	  {
	    		  if(player2[i-1]==10)
	    		  {
		    		  arr1[i]=arr1[i-1]+2*player2[i];
		    	  }
		    	  else
		    	  {
		    		  arr1[i]=arr1[i-1]+player2[i];
		    	  }
	    			  
	    		  
	    	  }
	    	  
	      }
	        sum1=arr[arr.length-1];
	        sum2=arr1[arr1.length-1];
	        System.out.println(sum1+ " "+ sum2);
	        if(sum1>sum2)
	        {
	            return 1;
	        }
	        else if(sum1<sum2)
	        {
	            return 2;
	        }
	        
	        else
	        {
	            return 0;
	        }
	    }
	}

