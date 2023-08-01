package problems.leetcode;

import java.util.LinkedList;
import java.util.List;

/*
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
 */
public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(reverseList(list));
	}
	
	
	 public static List reverseList(List head) {
		 LinkedList<Integer> list=new LinkedList<>();
		 
		 for(int i=head.size()-1;i>=0;i--)
		 {
			list.add((Integer) head.get(i)); 
		 }
	        return list;
	    }

}
