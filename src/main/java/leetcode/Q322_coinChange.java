package leetcode;

import java.util.Arrays;
import java.util.Map;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/22 10:17 上午
 * @modified By：
 */
public class Q322_coinChange {

    /**
    * 第一种方法：自顶向下
    * */
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
        else{
            int res = Integer.MAX_VALUE;
            for (int coin:coins) {
                int subCoins = dp(coins,amount-coin);
                if (subCoins == -1)
                    continue;
                res = Math.min(res,subCoins+1);
            }
            if (res!=Integer.MAX_VALUE)
                memo[amount] = res;
            else
                memo[amount] = -1;
            return memo[amount];
        }
    }

    /**
    * 第二种方法：自底向上
    */
    public int coinChange2(int[] coins, int amount) {
        memo = new int[amount+1];
        int min = amount+1;
        Arrays.fill(memo,min);
        memo[0] = 0;
        for (int i = 0; i < amount+1; i++) {        //i指memo表中amount所需金额，memo[i]表示所需的硬币数量
            for (int coin:coins) {
                if ((i-coin)<0)
                    continue;
                memo[i] = Math.min(memo[i],memo[i-coin]+1);
            }
        }
        if (memo[amount]==amount+1)
            return -1;
        else
            return memo[amount];
    }


    public static void main(String[] args) {
        Q322_coinChange a = new Q322_coinChange();
        int[] coins = {2,5,10,1};
        int amount = 27;
        System.out.println(a.coinChange2(coins, amount));
        for (int b:memo) {
            System.out.print(b);
        }
    }
}
