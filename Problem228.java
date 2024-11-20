/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 20-11-2024 14:47:43
PURPOSE       - Summary Ranges
COMPLEXITY    - Time: TO(nums.length), Space: SO(nums.length)
*/

import java.util.ArrayList;
import java.util.List;

public class Problem228
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        List<String> result = solution.summaryRanges(new int[]{0, 1, 2, 4, 5, 7});
        
        for (String range : result) System.out.print(range + " ");
        System.out.println();
    }
}


class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums == null || nums.length == 0) return new ArrayList<>();

        List<String> ranges = new ArrayList<>();
        int start = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) ranges.add(Integer.toString(start));
                else ranges.add(start + "->" + nums[i - 1]);
                start = nums[i];
            }
        }

        if (start == nums[nums.length - 1]) ranges.add(Integer.toString(start));
        else ranges.add(start + "->" + nums[nums.length - 1]);

        return ranges;
    }
}