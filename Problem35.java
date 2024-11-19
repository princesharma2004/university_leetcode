/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 19-11-2024 19:29:10
PURPOSE       - Search Insert Position
COMPLEXITY    - Time: TO(log nums.length), Space: SO(1)
*/

public class Problem35
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println("Index :" + solution.searchInsert(new int[] {1,3,5,6}, 5));
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }

        return left;        
    }
}