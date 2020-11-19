package leetcode;

/**
 * @author ：shadow
 * @date ：Created in 2020/11/19 2:31 下午
 * @modified By：
 */
public class Q283_moveZeroes {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[j]=nums[i];
                j++;
            }
        }
        while (j < nums.length){
            nums[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        Q283_moveZeroes object = new Q283_moveZeroes();
        object.moveZeroes(nums);
    }
}
