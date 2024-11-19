/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 19-11-2024 19:15:16
PURPOSE       - Remove Duplicates from Sorted Array
COMPLEXITY    - Time: TO(nums.length), Space: SO(1)
*/

public class Problem26
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int length = solution.removeDuplicates(arr);

        for (int i = 0; i < length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 1;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;        
    }
}