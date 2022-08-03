package dynamicProgramming;

public class Q714_maxProfitFee {
    public int maxProfit(int[] prices, int fee) {
        int f0 = -prices[0];//今天持有的最大利润
        int f1 = 0;//今天不持有的最大利润
        for (int i = 1; i < prices.length; i++) {
            int newf0 = Math.max(f0,f1-prices[i]);  //从两个状态转移而来，1、昨天持有今天也持有。2、昨天不持有，今天持有
            int newf1 = Math.max(f1,f0+prices[i]-fee);//从两个状态转移而来，1、昨天不持有今天也不持有。2、昨天持有，今天卖出，从而不持有。
            f0 = newf0;
            f1 = newf1;
        }
        return Math.max(f0,f1);
    }

    public static void main(String[] args) {
        Q714_maxProfitFee a = new Q714_maxProfitFee();
        int[] test = {1,3,7,5,10,3};
        int fee = 3;
        System.out.println(a.maxProfit(test,fee));
    }
}
