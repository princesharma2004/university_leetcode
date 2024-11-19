/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 19-11-2024 19:39:00
PURPOSE       - Plus One
COMPLEXITY    - Time: TO(digits.length), Space: SO(digits.length)
*/

public class Problem66
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] result = solution.plusOne(new int[] {1,2,3});

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;        
    }
}