/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 19-11-2024 19:44:22
PURPOSE       - Merge Sorted Array
COMPLEXITY    - Time: TO(m + n), Space: SO(1)
*/

public class Problem88
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {4,5,6};

        solution.merge(nums1, 3, nums2, 3);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int midx = m - 1, nidx = n - 1, right = m + n - 1;

        while (nidx >= 0) {
            if (midx >= 0 && nums1[midx] > nums2[nidx]) {
                nums1[right] = nums1[midx];
                midx--;
            } else {
                nums1[right] = nums2[nidx];
                nidx--;
            }
            right--;
        }        
    }
}