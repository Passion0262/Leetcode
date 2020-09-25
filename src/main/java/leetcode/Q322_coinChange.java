package leetcode;

import java.util.Map;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/22 10:17 上午
 * @modified By：
 */
public class Q322_coinChange {

    static int[] memo;

    public int coinChange(int[] coins, int amount) {
        memo = new int[amount+1];
        if (amount<1)
            return 0;
        return dp(coins,amount);
    }

    int dp(int[] coins,int amount){
        if (amount==0)
            return 0;
        if (amount<0)
            return -1;
        if (memo[amount]!=0)
            return memo[amount];
        double res = Double.POSITIVE_INFINITY;
        for (int coin:coins) {
            int subCoins = dp(coins,amount-coin);
            if (subCoins==-1)
                continue;
            res = Math.min(res,subCoins+1);
        }
        if (res>0 && res!=Double.POSITIVE_INFINITY)
            memo[amount] = (int)res;
        else
            memo[amount] = -1;
        return memo[amount];
    }

    public static void main(String[] args) {
        Q322_coinChange a = new Q322_coinChange();
        int[] coins = {2};
        int amount = 3;
        System.out.println(a.coinChange(coins, amount));
        for (int b:memo) {
            System.out.print(b);
        }
    }
}
