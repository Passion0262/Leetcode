package dynamicProgramming;

public class Q198_rob1 {
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
        Q198_rob1 a = new Q198_rob1();
        int[] test = {2,7,9,3,1};
        System.out.println(a.rob(test));
    }
}
