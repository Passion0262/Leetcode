package dynamicProgramming;

public class Q55_canJump {
    public boolean canJump(int[] nums) {
        int maxDis = 0; //记录可到达的最远距离
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (maxDis < i) {
                return false;
            }
            maxDis = Math.max(maxDis,i+nums[i]);
        }
        return maxDis >= length-1;
    }

    public static void main(String[] args) {
        Q55_canJump a = new Q55_canJump();
        int[] test = {0};
        System.out.println(a.canJump(test));
    }
}
