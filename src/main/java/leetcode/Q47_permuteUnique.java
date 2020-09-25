package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/18 10:12 上午
 * @modified By：
 */
public class Q47_permuteUnique {
    List<List<Integer>> res = new LinkedList<>();
    int current = 0;    //用于记录在递归到数组中的位置

    public List<List<Integer>> permuteUnique(int[] nums) {
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
            backtrack(nums, path);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        for (int i = 0,j = 0; i < 5; i++,j++ ){

        }
//        int[] nums = {1, 2, 3};
//        leetcode.Q47_permuteUnique solution = new leetcode.Q47_permuteUnique();
//        List<List<Integer>> lists = solution.permuteUnique(nums);
//        System.out.println(lists);
    }
}
