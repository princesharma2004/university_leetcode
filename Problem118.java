/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 19-11-2024 21:38:20
PURPOSE       - Pascal's Triangle
COMPLEXITY    - Time: TO(numRows^2), Space: SO(numRows^2)
*/

import java.util.ArrayList;
import java.util.List;

public class Problem118
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        List<List<Integer>> triangle = solution.generate(5);

        for (List<Integer> row : triangle) {
            for (int num : row) System.out.print(num + " ");
            System.out.println();
        }
    }
}

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;

        if (numRows == 1) {
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            result.add(firstRow);
            return result;
        }

        result = generate(numRows - 1);
        List<Integer> prevRow = result.get(numRows - 2);
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);

        for (int i = 1; i < numRows - 1; i++) {
            currentRow.add(prevRow.get(i - 1) + prevRow.get(i));
        }

        currentRow.add(1);
        result.add(currentRow);

        return result;
    }
}