package dynamicProgramming;

/**
 * @author ：shadow
 * @date ：Created in 2022/7/26 23:35
 */
public class Q70_climbStairs {
    public int climbStairs(int n) {
        int pre = 0;
        int cur = 0;
        int next = 1;
        for (int i = 0; i < n; i++) {
            pre = cur;
            cur = next;
            next = pre + cur;
        }
        return next;
    }

    public static void main(String[] args) {
        Q70_climbStairs a = new Q70_climbStairs();
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println(a.climbStairs(i));
        }
    }
}
