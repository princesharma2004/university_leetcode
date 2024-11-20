/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 19-11-2024 19:03:16
PURPOSE       - Two Sum
COMPLEXITY    - Time: TO(nums.length), Space: SO(nums.length)
*/

import java.util.HashMap;
import java.util.Map;

public class Problem1
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] arr = solution.twoSum(new int[] {2,7,11,15}, 9);
        System.out.println("Index 1: " + arr[0] + ", Index 2: " + arr[1]);
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) return new int[] { map.get(complement), i };
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}