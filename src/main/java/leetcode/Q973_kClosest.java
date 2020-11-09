package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ：shadow
 * @date ：Created in 2020/11/9 3:22 下午
 * @modified By：
 */
public class Q973_kClosest {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                return (p1[0] * p1[0] + p1[1] * p1[1]) - (p2[0] * p2[0] + p2[1] * p2[1]);
            }
        });
        return Arrays.copyOfRange(points,0, K);
    }
}
