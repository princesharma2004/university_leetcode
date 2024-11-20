/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 20-11-2024 15:06:34
PURPOSE       - Move Zeroes
COMPLEXITY    - Time: TO(nums.length), Space: SO(1)
*/

public class Problem283
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);

        for (int num : nums) System.out.print(num + " ");
        System.out.println();
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];

                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }        
    }
}