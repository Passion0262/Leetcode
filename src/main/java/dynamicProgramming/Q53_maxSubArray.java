package dynamicProgramming;

import java.util.Arrays;

/**
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 子数组 是数组中的一个连续部分。
 *
 * 示例 1：
 *
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组[4,-1,2,1] 的和最大，为6 。
 * 示例 2：
 *
 * 输入：nums = [1]
 * 输出：1
 * 示例 3：
 *
 * 输入：nums = [5,4,-1,7,8]
 * 输出：23
 *
 * 链接：https://leetcode.cn/problems/maximum-subarray
 */
public class Q53_maxSubArray {
    /**
     *  用maxArray数组去存放 以第 i 个数结尾的「连续子数组的最大和」
     */
    public int maxSubArray2(int[] nums) {
        int length = nums.length;
        int[] maxArray = new int[length];
        maxArray[0] = nums[0];
        for (int i = 1; i < length; i++) {
            maxArray[i] = Math.max(maxArray[i-1]+nums[i],nums[i]);
        }
        return Arrays.stream(maxArray).max().getAsInt();
    }

    /**
     *  上面的方法空间复杂度为O(n)。
     *  考虑到 f(i) 只和 f(i−1) 相关，
     *  于是我们可以只用一个变量 pre 来维护对于当前 f(i) 的 f(i−1) 的值是多少，
     *  从而让空间复杂度降低到 O(1)，这有点类似「滚动数组」的思想。
     *
     */
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int max = nums[0];
        for (int num:nums) {
            pre = Math.max(pre+num,num);
            max = Math.max(max,pre);
        }
        return max;
    }

    public static void main(String[] args) {
        Q53_maxSubArray a = new Q53_maxSubArray();
//        int[] test = {-2,1,-3,4,-1,2,1,-5,4};
        int[] test = {5,4,-1,7,8};
        System.out.println(a.maxSubArray(test));
    }
}
