package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/6 2:48 下午
 * @modified By：
 *
 * 这题思路就是用广度优先搜索bfs
 */

public class Q111_minDepth {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;          // root本身也是，所以深度初始为1。
        while (!queue.isEmpty()){
            int size = queue.size();        //这里size要提前定下来
            for (int i = 0; i < size; i++) {    //此处循环条件中的size不能直接写queue.size，不然循环中会更改
                TreeNode node = queue.poll();
                if(node.left==null && node.right==null){    //如果是叶子节点，那么第一个遇到的肯定就是深度最小的，直接返回即可。
                    return depth;
                }
                if(node.left!=null){                    //依次让左节点、右节点入队。
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
    }

    public static void main(String[] args) {
        Q111_minDepth a = new Q111_minDepth();
        a.test();
    }

    void test(){
        TreeNode node3 = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        node3.left = node9;
        node3.right = node20;
        node20.left = node15;
        node20.right = node7;
        System.out.println(minDepth(node3));
    }
}
