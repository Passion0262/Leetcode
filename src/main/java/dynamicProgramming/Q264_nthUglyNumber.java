package dynamicProgramming;

public class Q264_nthUglyNumber {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n+3];
        dp[1] = 1;
        int p2 = 1, p3 = 1, p5 = 1;
        for (int i = 1; i < n+2; i++) {
            int cur = dp[i];
            int min = Math.min(dp[p2]*2,Math.min(dp[p3]*3,dp[p5]*5));
            dp[i+1] = min;
            if (min == dp[p2]*2) {
                p2 ++;
            }
            if (min == dp[p3]*3) {
                p3 ++;
            }
            if (min == dp[p5]*5) {
                p5 ++;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Q264_nthUglyNumber a = new Q264_nthUglyNumber();
        System.out.println(a.nthUglyNumber(10));
    }
}
