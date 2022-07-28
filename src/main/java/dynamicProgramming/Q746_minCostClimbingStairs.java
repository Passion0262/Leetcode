package dynamicProgramming;

/**
 * @author ：shadow
 * @date ：Created in 2022/7/27 23:07
 */
public class Q746_minCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int size = cost.length;
        int[] answer = new int[size+1];
        for (int i = 2; i < size+1; i++) {
            int method1 = answer[i-2]+cost[i-2];
            int method2 = answer[i-1]+cost[i-1];
            if (method1 < method2){
                answer[i] = method1;
            } else {
                answer[i] = method2;
            }
        }
        return answer[size];
    }

    /**
     *  使用滑动数组代替数组，空间复杂度从O(n)降为O(1)，
     */
    public int minCostClimbingStairs2(int[] cost) {
        int size = cost.length;
        int pre = 0;
        int cur = 0;
        int next = 0;
        for (int i = 2; i <= size; i++) {
            next = Math.min(pre + cost[i-2] , cur + cost[i-1]);
            pre = cur;
            cur = next;
        }
        return next;
    }

    public static void main(String[] args) {
        Q746_minCostClimbingStairs a = new Q746_minCostClimbingStairs();
        int[] test = {10,15,20};
        int[] test2 = {1,100,1,1,1,100,1,1,100,1};
        int result = a.minCostClimbingStairs2(test2);
        System.out.println(result);
    }
}
