/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 20-11-2024 14:34:03
PURPOSE       - Contains Duplicate II
COMPLEXITY    - Time: TO(nums.length), Space: SO(k)
*/

import java.util.HashSet;
import java.util.Set;

public class Problem219
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println("Contains Nearby Duplicate: " + solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }
}

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k) seen.remove(nums[i - k - 1]);
            if (seen.contains(nums[i])) return true;
            seen.add(nums[i]);
        }

        return false;        
    }
}