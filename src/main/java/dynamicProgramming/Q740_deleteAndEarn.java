package dynamicProgramming;

import java.util.Arrays;
import java.util.OptionalInt;

public class Q740_deleteAndEarn {

    public int deleteAndEarn(int[] nums) {
        int maxVal = 0;
        for (int val : nums) {
            maxVal = Math.max(maxVal, val);
        }
        int[] sumArr = new int[maxVal+1];
        for (int num:nums) {
            sumArr[num] += num;
        }
        return rob(sumArr);
    }

    public int rob(int[] nums) {
        int size = nums.length;
        if (size == 1){
            return nums[0];
        } else if (size == 2){
            return Math.max(nums[0],nums[1]);
        }

        int pre = nums[0];
        int cur = Math.max(nums[0],nums[1]);
        for (int i = 2; i < size; i++) {
            int next = Math.max(pre+nums[i],cur);
            pre = cur;
            cur = next;
        }
        return cur;
    }

    public static void main(String[] args) {
        Q740_deleteAndEarn a = new Q740_deleteAndEarn();
//        int[] test = {3,4,2};
        int[] test = {2,2,3,3,3,4};
        System.out.println(a.deleteAndEarn(test));
    }

}
