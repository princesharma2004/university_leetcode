/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 20-11-2024 15:43:42
PURPOSE       - Intersection of Two Arrays II
COMPLEXITY    - Time: TO(nums1.length + nums2.length), Space: SO(min(nums1.length, nums2.length))
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem350
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] result = solution.intersect(new int[]  {1, 2, 2, 1}, new int[] {2, 2});

        for (int num : result) System.out.print(num + " ");
        System.out.println();
    }
}

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
      
        for(int num : nums1) map.put(num, map.getOrDefault(num, 0) + 1);
        
        for(int num : nums2) {
            if (map.containsKey(num)) {
                list.add(num);
                map.replace(num, map.get(num) - 1);
                if(map.get(num) == 0) map.remove(num);
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}