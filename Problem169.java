/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 20-11-2024 14:10:37
PURPOSE       - Majority Element
COMPLEXITY    - Time: TO(nums.length), Space: SO(1)
*/

public class Problem169
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println("Majority Element: " + solution.majorityElement(new int[]{3, 2, 3}));
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int majority = 0;
        
        for (int n : nums) {
            if (majority == 0) res = n;
            majority += n == res ? 1 : -1;
        }
        
        return res;        
    }
}