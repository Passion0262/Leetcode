package dynamicProgramming;

public class Q918_maxSubarraySumCircular {
    public int maxSubarraySumCircular(int[] nums) {
        int length = nums.length;
        int curMax = 0;
        int sumMax = nums[0];
        int curMin = 0;
        int sumMin = nums[0];
        int total = 0;
        for (int num:nums) {
            curMax = Math.max(curMax+num,num);
            sumMax = Math.max(curMax,sumMax);
            curMin = Math.min(curMin+num,num);
            sumMin = Math.min(curMin,sumMin);
            total += num;
        }
        if (total == sumMin){
            return sumMax;
        }
        return Math.max(sumMax,total-sumMin);
    }

    public static void main(String[] args) {
        Q918_maxSubarraySumCircular a = new Q918_maxSubarraySumCircular();
        int[] test = {-3,-2,-3};
        System.out.println(a.maxSubarraySumCircular(test));
    }
}
