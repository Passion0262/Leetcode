package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class Q120_minimumTotal {

    /**
     * 对原二维数组进行修改
     */
    public int minimumTotal2(List<List<Integer>> triangle) {
        int length = triangle.size();
        for (int i = length-2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int cur = triangle.get(i).get(j) + Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1));
                triangle.get(i).set(j,cur);
            }
        }
        return triangle.get(0).get(0);
    }

    /**
     *  另创建一个二维数组来存储
     *  因为array的读写速度比list快，此方法执行用时更短。
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        int length = triangle.size();
        int[][] dp = new int[length+1][length+1];
        for (int i = length-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        Q120_minimumTotal a = new Q120_minimumTotal();
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
//        list.get(0).add(-10);
        list.get(0).add(2);
        list.add(new ArrayList<>());
        list.get(1).add(3);
        list.get(1).add(4);
        list.add(new ArrayList<>());
        list.get(2).add(6);
        list.get(2).add(5);
        list.get(2).add(7);
        list.add(new ArrayList<>());
        list.get(3).add(4);
        list.get(3).add(1);
        list.get(3).add(3);
        list.get(3).add(8);
        System.out.println(a.minimumTotal(list));
    }
}
