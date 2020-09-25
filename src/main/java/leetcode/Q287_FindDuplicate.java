package leetcode;

import java.util.Arrays;

/**
 * @author ：shadow
 * @date ：Created in 2020/5/26 12:49 上午
 * @modified By：
 */
public class Q287_FindDuplicate {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int l = 1, r = n - 1, ans = -1;
        while (l <= r) {
            int mid = (l + r) >> 1;
            int cnt = 0;
            cnt = (int)Arrays.stream(nums).filter(e -> e<=mid).count();
//            for (int i = 0; i < n; ++i) {
//                if (nums[i] <= mid) {
//                    cnt++;
//                }
//            }
            if (cnt <= mid) {       //抽屉原理，
                l = mid + 1;
            } else {
                r = mid - 1;        //如果<=mid的数的数量 比 mid大，说明【1，mid】抽屉放不下，所以重复数就在【1，mid】中
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Q287_FindDuplicate a = new Q287_FindDuplicate();
        int[] nums = {1,3,4,2,2};
        System.out.println(a.findDuplicate(nums));
    }
}
