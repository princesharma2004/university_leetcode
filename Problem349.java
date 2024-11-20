/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 20-11-2024 15:32:38
PURPOSE       - Intersection of Two Arrays
COMPLEXITY    - Time: TO(nums1.length + nums2.length), Space: SO(min(nums1.length, nums2.length))
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Problem349
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] result = solution.intersection(new int[]  {1, 2, 2, 1}, new int[] {2, 2});

        for (int num : result) System.out.print(num + " ");
        System.out.println();
    }
}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int num : nums1) set.add(num);
        for(int num : nums2){
            if(set.contains(num)) {list.add(num); set.remove(num);}
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}