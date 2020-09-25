package leetcode;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/23 12:27 下午
 * @modified By：
 *
 *
 */
public class Q617_mergeTrees {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1==null)
            return t2;
        else if (t2==null)
            return t1;

        TreeNode result = new TreeNode(t1.val+t2.val);
        result.left = mergeTrees(t1.left,t2.left);
        result.right=mergeTrees(t1.right,t2.right);

        return result;
    }

    public static void main(String[] args) {
        Q617_mergeTrees a = new Q617_mergeTrees();
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.left.left = new TreeNode(5);
        t1.right = new TreeNode(2);

        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        t2.left.right = new TreeNode(4);
        t2.right.right = new TreeNode(7);

        TreeNode t = a.mergeTrees(t1,t2);
        a.dps(t);


    }

    public void dps(TreeNode t){
        if (t.left!=null)
            dps(t.left);
        System.out.println(t.val);
        if (t.right!=null)
            dps(t.right);
    }


}
