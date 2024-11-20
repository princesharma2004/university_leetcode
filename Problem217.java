/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 20-11-2024 14:17:06
PURPOSE       - Contains Duplicate
COMPLEXITY    - Time: TO(nums.length), Space: SO(nums.length)
*/

import java.util.HashSet;
import java.util.Set;

public class Problem217
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println("Contains Duplicate: " + solution.containsDuplicate(new int[]{1, 2, 3, 1}));
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) numSet.add(num);
        return numSet.size() < nums.length;
    }
}