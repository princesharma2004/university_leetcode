/*
AUTHOR        - PRINCE SHARMA
DATE AND TIME - 20-11-2024 15:20:01
PURPOSE       - Range Sum Query - Immutable
COMPLEXITY    - Time: TO(nums.length, 1), Space: SO(nums.length, 1)
*/

public class Problem303
{
    public static void main(String[] args)
    {
        NumArray numArray = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2));
    }
}

class NumArray {
    int num[];

    public NumArray(int[] nums) {
        for(int i = 1;i<nums.length;i++) nums[i]+=nums[i-1];
        this.num= nums;
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) return num[right];
        else return num[right]-num[left-1];
    }
}