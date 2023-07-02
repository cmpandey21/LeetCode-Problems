package Leetcode;

import java.util.HashMap;
import java.util.Map;

/*
Input: nums = [1,2,3,1], k = 3
Output: true
 */
public class ContainsNearbyDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {1,2,3,1};
		int k = 3;
		System.out.println(containsNearbyDuplicate(nums, k));
	}
	
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
     
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) return true;
             
            }
            map.put(nums[i], i);
        }
        return false;
    }

}
