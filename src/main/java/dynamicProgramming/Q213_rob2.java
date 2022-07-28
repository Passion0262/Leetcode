package dynamicProgramming;

public class Q213_rob2 {
    public int rob(int[] nums) {
        int size = nums.length;
        if (size == 1){
            return nums[0];
        } else if (size == 2){
            return Math.max(nums[0],nums[1]);
        }
        return Math.max(rob_sub(nums,0,size-2),rob_sub(nums,1,size-1));
    }

    public int rob_sub(int[] nums,int start,int end){
        int pre = nums[start];
        int cur = Math.max(nums[start],nums[start+1]);
        for (int i = start+2; i <= end; i++) {
            int next = Math.max(pre+nums[i],cur);
            pre = cur;
            cur = next;
        }
        return cur;
    }

    public static void main(String[] args) {
        Q213_rob2 a = new Q213_rob2();
        System.out.println(a.rob(new int[]{1, 2, 3, 1}));
    }
}
