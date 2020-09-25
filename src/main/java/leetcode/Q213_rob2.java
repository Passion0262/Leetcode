package leetcode;

import java.util.Arrays;

/**
 * @author ：shadow
 * @date ：Created in 2020/5/29 9:50 上午
 * @modified By：
 */
public class Q213_rob2 {

    public int rob(int[] nums){
        if(nums==null || nums.length==0){
            return 0;
        }
        int length = nums.length;
        if(length==1){
            return nums[0];
        }
        return Math.max(subrob(Arrays.copyOf(nums,length-1)), subrob(Arrays.copyOfRange(nums,1,length)));
    }

    public int subrob(int[] nums) {
        final int length = nums.length;
        if(nums.length==0){
            return 0;
        }
        if(length==1){
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
        Q213_rob2 a = new Q213_rob2();
        int[] arr = {2,3,2};
        System.out.println(a.rob(arr));
    }



}
