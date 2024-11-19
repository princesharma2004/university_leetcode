/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 19-11-2024 19:24:47
PURPOSE       - Remove Element
COMPLEXITY    - Time: TO(nums.length), Space: SO(1)
*/

public class Problem27
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] arr = {0,1,2,2,3,3,4,4,5};
        int length = solution.removeElement(arr, 2);

        for (int i = 0; i < length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;        
    }
}