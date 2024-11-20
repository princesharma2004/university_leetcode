/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 19-11-2024 22:04:24
PURPOSE       - Best Time to Buy and Sell Stock
COMPLEXITY    - Time: TO(prices.length), Space: SO(1)
*/

public class Problem121
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println("Maximum Profit: " + solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) buyPrice = prices[i];
            profit = Math.max(profit, prices[i] - buyPrice);
        }

        return profit;        
    }
}