package dynamicProgramming;

import java.util.Arrays;

public class offer_Q103_coinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for (int i = 0; i < amount+1; i++) {
            for (int coin:coins) {
                int sub_amount = i-coin;
                if (sub_amount<0)
                    continue;
                dp[i] = Math.min(dp[i],dp[sub_amount]+1);
            }
        }
        return dp[amount]==amount+1?-1:dp[amount];
    }

    public static void main(String[] args) {
        offer_Q103_coinChange a = new offer_Q103_coinChange();
        int[] coins = {1,3,5};
        int amount = 23;
        System.out.println(a.coinChange(coins, amount));
    }
}
