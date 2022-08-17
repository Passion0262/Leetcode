package dynamicProgramming;

public class Q413_numberOfArithmeticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return 0;
        }

        int d = nums[0] - nums[1];
        int t = 0;
        int ans = 0;
        // 因为等差数列的长度至少为 3，所以可以从 i=2 开始枚举
        for (int i = 2; i < length; ++i) {
            if (nums[i - 1] - nums[i] == d) {
                ++t;
            } else {
                d = nums[i - 1] - nums[i];
                t = 0;
            }
            ans += t;
        }
        return ans;
    }

}
