package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/6 3:44 下午
 * @modified By：
 */
public class Q102_levelOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> listList = new LinkedList<List<Integer>>();
        if(root == null) return listList;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left!=null)
                    queue.offer(node.left);
                if(node.right!=null)
                    queue.offer(node.right);
            }
            listList.add(list);
        }
        return listList;
    }
}
