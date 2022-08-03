package dynamicProgramming;

public class Q152_maxProduct {
    public int maxProduct(int[] nums) {
        int length = nums.length;
        int[] dpMax = new int[length];
        int[] dpMin = new int[length];
        dpMax[0] = nums[0];
        dpMin[0] = nums[0];
        for (int i = 1; i < length; i++) {
            int curNum = nums[i];
            dpMax[i] = Math.max(dpMax[i-1]*curNum,Math.max(dpMin[i-1]*curNum,curNum));
            dpMin[i] = Math.min(dpMax[i-1]*curNum,Math.min(dpMin[i-1]*curNum,curNum));
        }
        int max = nums[0];
        for (int i = 0; i < length; i++) {
            max = Math.max(dpMax[i],max);
        }
        return max;
    }

    public static void main(String[] args) {
        Q152_maxProduct a = new Q152_maxProduct();
        int[] test = {-2,0,-1};
        System.out.println(a.maxProduct(test));
    }
}
