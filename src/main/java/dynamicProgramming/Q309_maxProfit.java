package dynamicProgramming;

public class Q309_maxProfit {
    public int maxProfit(int[] prices) {
        int f0 = -prices[0];//第i天结束之后，持有股票的最大利润
        int f1 = 0;//第i天结束之后，不持有股票，处于冷冻期的最大利润
        int f2 = 0;//第i天结束之后，不持有股票，不处于冷冻期的最大利润
        for (int i = 1; i < prices.length; i++) {
            int newf0 = Math.max(f0,f2-prices[i]);
            int newf1 = f0+prices[i];
            int newf2 = Math.max(f1,f2);
            f0 = newf0;
            f1 = newf1;
            f2 = newf2;
        }
        return Math.max(f0,Math.max(f1,f2));
    }

    public static void main(String[] args) {
        Q309_maxProfit a = new Q309_maxProfit();
        int[] test = {1};
        System.out.println(a.maxProfit(test));
    }
}
