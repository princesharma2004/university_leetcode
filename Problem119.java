/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 19-11-2024 21:51:28
PURPOSE       - Pascal's Triangle II
COMPLEXITY    - Time: TO(rowIndex), Space: SO(rowIndex)
*/

import java.util.ArrayList;
import java.util.List;

public class Problem119
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        List<Integer> row = solution.getRow(3);

        for (int num : row) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int k = 1; k <= rowIndex; k++) {
            long nextElement = (long) row.get(k - 1) * (rowIndex - k + 1) / k;
            row.add((int) nextElement);
        }

        return row;
    }
}