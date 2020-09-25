package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/8 7:48 下午
 * @modified By：
 *
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 */
public class Q46_permute {
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> path = new LinkedList<>();
        backtrack(nums,path);
        return res;
    }

    public void backtrack(int[] nums,LinkedList<Integer> path){
        if (path.size() == nums.length) {
            res.add(new LinkedList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (path.contains(nums[i]))
                continue;
            path.add(nums[i]);
            backtrack(nums,path);
            path.removeLast();
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Q46_permute solution = new Q46_permute();
        List<List<Integer>> lists = solution.permute(nums);
        System.out.println(lists);
    }
}
