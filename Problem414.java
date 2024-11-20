/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 20-11-2024 16:00:27
PURPOSE       - Third Maximum Number
COMPLEXITY    - Time: TO(nums.length), Space: SO(1)
*/

public class Problem414
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println("Third Maximum Number: " + solution.thirdMax(new int[] {3, 2, 1}));
    }
}

class Solution {
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE, secondMax = Long.MIN_VALUE, thirdMax = Long.MIN_VALUE;
        
        for (int num : nums) {
            if (firstMax == num || secondMax == num || thirdMax == num) continue;
            
            if (firstMax <= num) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            }
            else if (secondMax <= num) {
                thirdMax = secondMax;
                secondMax = num;
            }
            else if (thirdMax <= num) thirdMax = num;
        }
        
        if (thirdMax == Long.MIN_VALUE) return (int) firstMax;
        return (int) thirdMax;
    }
}