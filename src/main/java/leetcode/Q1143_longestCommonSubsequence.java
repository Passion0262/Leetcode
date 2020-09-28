package leetcode;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/28 8:03 下午
 * @modified By：
 *
 * 动态规划的典型题目，关键要找到状态转移方程。 即23行、25行代码。
 */
public class Q1143_longestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        int[][] dp = new int[len1+1][len2+1];
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if (i==0 || j==0){
                    dp[i][j] = 0;
                    continue;
                }
                if (text1.charAt(i-1) == text2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1]+1;
                else
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[len1][len2];
    }

    public static void main(String[] args) {
        Q1143_longestCommonSubsequence a = new Q1143_longestCommonSubsequence();
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(a.longestCommonSubsequence(s1, s2));
    }
}
