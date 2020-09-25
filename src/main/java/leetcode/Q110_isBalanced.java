package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/5 3:10 下午
 * @modified By：
 */
public class Q110_isBalanced {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isBalanced(TreeNode root) {
        int leftChildHeight = Height(root.left);
        int rightChildHeight = Height(root.right);
        return Math.abs(leftChildHeight-rightChildHeight) <= 1;
    }

    public int Height(TreeNode root){
        if(root == null){

        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
