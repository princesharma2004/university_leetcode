/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 19-11-2024 22:18:13
PURPOSE       - Single Number
COMPLEXITY    - Time: TO(nums.length), Space: SO(1)
*/

public class Problem136
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println("Single Number: " + solution.singleNumber(new int[]{2, 2, 1, 3, 3}));
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) result ^= num;
        return result;
    }
}