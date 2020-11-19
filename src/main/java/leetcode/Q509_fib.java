package leetcode;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/23 1:10 下午
 * @modified By：
 */
public class Q509_fib {
    int[] memo = null;
    public int fib(int N) {
        if (N==0)
            return 0;
        if (memo == null){
            memo = new int[N+1];        //这是是N+1，不是N
            memo[0] = 0;
            memo[1] = 1;
            memo[2] = 1;
        }
        if (memo[N]!=0) {               //备忘录中有的话直接取，否则递归计算。
            return memo[N];
        }else {
            return memo[N] = fib(N-1)+fib(N-2);
        }
    }

    public static void main(String[] args) {
        Q509_fib a = new Q509_fib();
        System.out.println(a.fib(10));;
    }
}
