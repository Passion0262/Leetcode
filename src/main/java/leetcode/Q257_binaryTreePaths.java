package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/4 2:22 下午
 * @modified By：
 */
public class Q257_binaryTreePaths {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
//        List<String> paths = new ArrayList<>();
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        constructPath(root,"",paths);
        return paths;
    }

    public void constructPath(TreeNode root,String currentPath,List<String> paths){
        if(root!=null){
            String path = currentPath;
            path += root.val;
            if(root.left==null && root.right==null){        //该节点是叶子结点
                paths.add(path);
            }else{                                          //该节点不是叶子结点
                path += "->";
                constructPath(root.left,path,paths);
                constructPath(root.right,path,paths);
            }
        }
    }


}
