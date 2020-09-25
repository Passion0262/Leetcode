package leetcode;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/5 8:37 下午
 * @modified By：
 *
 * 不需要特地用一个变量去存储Depth这个值，直接在return返回值中表示
 * Max(左子树高度，右子树高度)+1
 */
public class Q104_maxDepth {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftChildHeight = maxDepth(root.left);
        int rightChildHeight = maxDepth(root.right);
        return Math.max(leftChildHeight,rightChildHeight)+1;
    }
}
