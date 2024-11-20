/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 20-11-2024 14:56:52
PURPOSE       - Missing Number
COMPLEXITY    - Time: TO(nums.length), Space: SO(1)
*/

public class Problem268
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println("Missing Number: " + solution.missingNumber(new int[]{3, 0, 1}));
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) res += i - nums[i];
        return res;       
    }
}