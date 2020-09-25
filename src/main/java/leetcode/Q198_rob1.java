package leetcode;

/**
 * @author ：shadow
 * @date ：Created in 2020/5/29 8:30 上午
 * @modified By：
 */
public class Q198_rob1 {

    public int rob(int[] nums) {
        final int length = nums.length;
        if(nums==null || length==0){
            return 0;
        }else if(length==1){
            return nums[0];
        }
        int[] sum = new int[length];
        sum[0] = nums[0];
        sum[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < length; i++) {
            sum[i] = Math.max(sum[i-2]+nums[i],sum[i-1]);
        }
        return sum[length-1];
    }

    public static void main(String[] args) {
        Q198_rob1 a = new Q198_rob1();
        int[] arr = {2,7,9,3,1};
        System.out.println(a.rob(arr));
    }

}
