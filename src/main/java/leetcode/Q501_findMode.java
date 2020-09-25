package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/24 4:10 下午
 * @modified By：
 */
public class Q501_findMode {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    int curNum = Integer.MAX_VALUE-1;
    int curCount = 0;
    int modeCount = 0;
    List<Integer> answer = new ArrayList<Integer>();

    public int[] findMode(TreeNode root) {
        if (root==null)
            return null;
        findMode(root.left);
        if (root.val == curNum){
            curCount++;
            if (curCount > modeCount){
                answer.clear();
                answer.add(curNum);
                modeCount = curCount;
            }
        }else {
            if (curCount > modeCount){
                answer.clear();
                answer.add(curNum);
                modeCount = curCount;
            }else if(modeCount == 0){
                answer.add(root.val);
                modeCount++;
            }else if(curCount == modeCount){
                answer.add(curNum);
            }
            curNum = root.val;
            curCount = 1;
        }
        findMode(root.right);

        int[] res = new int[answer.size()];
        for (int i = 0; i < answer.size(); ++i) {
            res[i] = answer.get(i);
        }
        return res;
    }

    public void test(){
        TreeNode t1 = new TreeNode(Integer.MAX_VALUE);
//        TreeNode t2 = new TreeNode(2);
//        TreeNode t3 = new TreeNode(2);
//        t1.right = t2;
//        t2.left = t3;
        for (int i:findMode(t1)) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Q501_findMode a = new Q501_findMode();
        a.test();
    }
}
