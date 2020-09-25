package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/14 12:47 下午
 * @modified By：
 */
public class Q94_inorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        inorder(root,list);
        return list;
    }

    public void inorder(TreeNode root,List<Integer> list){
        if (root == null)
            return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}
