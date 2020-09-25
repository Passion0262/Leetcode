package dynamicProgramming;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/21 6:22 下午
 * @modified By：
 */
public class Fibonacci {
    int fib(int n){
        if (n < 1)
            return 0;
        int[] arr = new int[n+1];
        return helper(arr,n);
    }

    int helper(int[] memo,int n){
        if (n == 1 || n == 2) return 1;
        // 已经计算过
        if (memo[n] != 0) return memo[n];
        memo[n] = helper(memo, n - 1) + helper(memo, n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        Fibonacci a = new Fibonacci();
        System.out.println(a.fib(4));
    }
}
