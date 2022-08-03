package dynamicProgramming;

public class Q45_jump {
    public int jump(int[] nums) {
        int step = 0;   //跳跃次数
        int cur_max = 0;
        int next_max = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (i+nums[i]>next_max)
                next_max = i+nums[i];
            if ( i == cur_max ){
                step++;
                cur_max = next_max;
            }
        }
        return step;
    }

    public static void main(String[] args) {
        Q45_jump a = new Q45_jump();
        int[] test = {2,3,1,1,4};
        System.out.println(a.jump(test));
    }
}
